package com.gochinatv.cdn.dto.security.systemrole;

import com.gochinatv.cdn.dto.common.BaseRequest;

/**
 * 系统角色请求对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:32
 */
public class SystemRoleRequest extends BaseRequest
{
    private Long userId;

    public SystemRoleRequest()
    {

    }

    public SystemRoleRequest(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }
}
