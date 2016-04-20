package com.gochinatv.cdn.dto.security.systemrole;

import com.gochinatv.cdn.dto.common.BaseResponse;
import com.gochinatv.cdn.po.security.SystemRoleInfo;

import java.util.List;

/**
 * 系统角色请求响应对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:33
 */
public class SystemRoleResponse extends BaseResponse
{
    private List<SystemRoleInfo> systemRoleInfos;

    public List<SystemRoleInfo> getSystemRoleInfos()
    {
        return systemRoleInfos;
    }

    public void setSystemRoleInfos(List<SystemRoleInfo> systemRoleInfos)
    {
        this.systemRoleInfos = systemRoleInfos;
    }
}
