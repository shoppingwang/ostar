package com.gochinatv.cdn.analysis.security;

import com.gochinatv.cdn.po.security.SystemAccountInfo;
import com.gochinatv.cdn.po.security.SystemUserInfo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Spring security认证用户
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:02
 */
public class CustomUserDetails extends User
{
    private SystemUserInfo systemUser;

    private SystemAccountInfo systemAccount;

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities)
    {
        super(username, password, authorities);
    }

    public CustomUserDetails(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities)
    {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public SystemUserInfo getSystemUser()
    {
        return systemUser;
    }

    public void setSystemUser(SystemUserInfo systemUser)
    {
        this.systemUser = systemUser;
    }

    public SystemAccountInfo getSystemAccount()
    {
        return systemAccount;
    }

    public void setSystemAccount(SystemAccountInfo systemAccount)
    {
        this.systemAccount = systemAccount;
    }
}
