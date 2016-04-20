package com.gochinatv.cdn.dto.security.systemuser;

import com.gochinatv.cdn.dto.common.BaseResponse;
import com.gochinatv.cdn.po.security.SystemUserInfo;

/**
 * 登陆用户信息响应对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 11:08
 */
public class LoginUserInfoResponse extends BaseResponse
{
    private SystemUserInfo systemUser;

    public SystemUserInfo getSystemUser()
    {
        return systemUser;
    }

    public void setSystemUser(SystemUserInfo systemUser)
    {
        this.systemUser = systemUser;
    }
}
