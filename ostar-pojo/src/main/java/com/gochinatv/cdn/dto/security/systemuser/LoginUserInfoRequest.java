package com.gochinatv.cdn.dto.security.systemuser;

import com.gochinatv.cdn.dto.common.BaseRequest;

/**
 * 登陆用户信息请求对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 11:06
 */
public class LoginUserInfoRequest extends BaseRequest
{
    private String loginName;

    public LoginUserInfoRequest()
    {

    }

    public LoginUserInfoRequest(String loginName)
    {
        this.loginName = loginName;
    }

    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
}
