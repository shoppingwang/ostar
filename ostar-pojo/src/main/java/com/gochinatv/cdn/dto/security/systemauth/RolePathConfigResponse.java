package com.gochinatv.cdn.dto.security.systemauth;

import com.gochinatv.cdn.dto.common.BaseResponse;

import java.util.List;

/**
 * 角色、资源请求响应对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 15:40
 */
public class RolePathConfigResponse extends BaseResponse
{
    private List<RolePathConfig> rolePathConfigs;

    public List<RolePathConfig> getRolePathConfigs()
    {
        return rolePathConfigs;
    }

    public void setRolePathConfigs(List<RolePathConfig> rolePathConfigs)
    {
        this.rolePathConfigs = rolePathConfigs;
    }
}
