package com.gochinatv.cdn.security.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gochinatv.cdn.dto.security.systemauth.RolePathConfigRequest;
import com.gochinatv.cdn.dto.security.systemauth.RolePathConfigResponse;
import com.gochinatv.cdn.infrastructure.mapper.security.RolePathConfigMapper;
import com.gochinatv.cdn.service.security.RolePathConfigService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 角色、资源关系加载
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 15:43
 */
@Service(protocol = {"dubbo", "rest"})
public class RolePathConfigServiceImpl implements RolePathConfigService
{
    @Autowired
    private RolePathConfigMapper rolePathConfigMapper;

    @Override
    public RolePathConfigResponse findAllRolePathByModuleCode(RolePathConfigRequest request)
    {
        RolePathConfigResponse response = new RolePathConfigResponse();
        response.setRolePathConfigs(rolePathConfigMapper.findAllRolePathByModuleCode(request.getModuleCode()));

        return response;
    }

    public void setRolePathConfigMapper(RolePathConfigMapper rolePathConfigMapper)
    {
        this.rolePathConfigMapper = rolePathConfigMapper;
    }
}
