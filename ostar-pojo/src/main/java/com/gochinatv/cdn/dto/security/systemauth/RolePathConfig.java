package com.gochinatv.cdn.dto.security.systemauth;

import com.gochinatv.cdn.pojo.BaseSerializer;

/**
 * 资源、角色关系
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 15:28
 */
public class RolePathConfig extends BaseSerializer
{
    private String resUrl;

    private String roleCode;

    public String getResUrl()
    {
        return resUrl;
    }

    public void setResUrl(String resUrl)
    {
        this.resUrl = resUrl;
    }

    public String getRoleCode()
    {
        return roleCode;
    }

    public void setRoleCode(String roleCode)
    {
        this.roleCode = roleCode;
    }
}
