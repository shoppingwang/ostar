package com.gochinatv.cdn.dto.security.systemauth;

import com.gochinatv.cdn.dto.common.BaseRequest;

/**
 * 角色、资源关系请求对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 15:39
 */
public class RolePathConfigRequest extends BaseRequest
{
    private String moduleCode;

    public RolePathConfigRequest() {}

    public RolePathConfigRequest(String moduleCode)
    {
        this.moduleCode = moduleCode;
    }

    public String getModuleCode()
    {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode)
    {
        this.moduleCode = moduleCode;
    }
}
