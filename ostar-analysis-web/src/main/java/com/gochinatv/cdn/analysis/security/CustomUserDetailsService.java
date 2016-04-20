package com.gochinatv.cdn.analysis.security;

import com.gochinatv.cdn.dto.security.systemrole.SystemRoleRequest;
import com.gochinatv.cdn.dto.security.systemrole.SystemRoleResponse;
import com.gochinatv.cdn.dto.security.systemuser.LoginUserInfoRequest;
import com.gochinatv.cdn.dto.security.systemuser.LoginUserInfoResponse;
import com.gochinatv.cdn.exception.DubboInternalInvokeException;
import com.gochinatv.cdn.po.security.SystemRoleInfo;
import com.gochinatv.cdn.po.security.SystemUserInfo;
import com.gochinatv.cdn.pojo.Constants;
import com.gochinatv.cdn.service.security.SystemRoleService;
import com.gochinatv.cdn.service.security.SystemUserService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.*;

/**
 * 用户验证及授权
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 12:57
 */
public class CustomUserDetailsService implements UserDetailsService
{
    private Logger logger = LoggerFactory.getLogger(getClass());

    private SystemUserService systemUserService;

    private SystemRoleService systemRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        //获取用户信息
        LoginUserInfoResponse loginUserResponse = systemUserService.findUserByLoginName(new LoginUserInfoRequest(username));
        if (loginUserResponse.isSuccess())
        {
            SystemUserInfo systemUser = loginUserResponse.getSystemUser();
            if (null != systemUser)
            {
                boolean enabled = Constants.GENERIC_ENABLED == systemUser.getUserStatus();
                boolean accountNonExpired = new Date().before(systemUser.getExpireDate());

                //获取用户角色信息
                SystemRoleResponse userRoleResponse = systemRoleService.findRolesByUserId(new SystemRoleRequest(systemUser.getUserId()));
                if (userRoleResponse.isSuccess())
                {
                    //创建用户权限信息
                    Collection<GrantedAuthority> grantedAuthorities = new HashSet<>();

                    List<SystemRoleInfo> systemRoleInfos = userRoleResponse.getSystemRoleInfos();
                    if (CollectionUtils.isNotEmpty(systemRoleInfos))
                    {
                        for (SystemRoleInfo systemRoleInfo : systemRoleInfos)
                        {
                            grantedAuthorities.add(new SimpleGrantedAuthority(systemRoleInfo.getRoleCode().trim()));
                        }
                    }

                    //创建用户信息
                    CustomUserDetails userDetails = new CustomUserDetails(systemUser.getUserName(), systemUser.getUserPassword()
                            , enabled, accountNonExpired, true, true, grantedAuthorities);

                    userDetails.setSystemUser(systemUser);
                    //TODO 获取账户信息

                    return userDetails;
                }
                else
                {
                    throw new DubboInternalInvokeException(userRoleResponse.getMessage());
                }
            }
            else
            {
                throw new UsernameNotFoundException("用户【" + username + "】不存在。");
            }
        }
        else
        {
            throw new DubboInternalInvokeException(loginUserResponse.getMessage());
        }
    }

    public void setSystemUserService(SystemUserService systemUserService)
    {
        this.systemUserService = systemUserService;
    }

    public void setSystemRoleService(SystemRoleService systemRoleService)
    {
        this.systemRoleService = systemRoleService;
    }
}
