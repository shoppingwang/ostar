package com.gochinatv.cdn.security.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gochinatv.cdn.dto.security.systemuser.LoginUserInfoRequest;
import com.gochinatv.cdn.dto.security.systemuser.LoginUserInfoResponse;
import com.gochinatv.cdn.po.security.SystemUserInfo;
import com.gochinatv.cdn.pojo.Constants;
import com.gochinatv.cdn.service.impl.BaseService;
import com.gochinatv.cdn.service.security.SystemUserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 系统用户服务
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/24 15:30
 */
@Service(protocol = {"dubbo", "rest"})
public class SystemUserServiceImpl extends BaseService<SystemUserInfo> implements SystemUserService
{
    @Override
    public LoginUserInfoResponse findUserByLoginName(LoginUserInfoRequest request)
    {
        LoginUserInfoResponse response = new LoginUserInfoResponse();

        if (null == request || StringUtils.isEmpty(request.getLoginName()))
        {
            response.setCodeAndMessage(Constants.FAIL_CODE, "登陆用户名不允许为空。");
        }
        else
        {
            Example example = new Example(SystemUserInfo.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("loginName", request.getLoginName());

            List<SystemUserInfo> systemUsers = selectByExample(example);
            if (CollectionUtils.isNotEmpty(systemUsers))
            {
                response.setSystemUser(systemUsers.get(0));
            }
        }

        return response;
    }
}
