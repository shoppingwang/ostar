package com.gochinatv.cdn.service.security;

import com.gochinatv.cdn.dto.security.systemauth.RolePathConfigRequest;
import com.gochinatv.cdn.dto.security.systemauth.RolePathConfigResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 角色、资源关系服务
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 15:36
 */
@Path("system/auth")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface RolePathConfigService
{
    @POST
    @Path("findAllRolePathByModuleCode")
    RolePathConfigResponse findAllRolePathByModuleCode(RolePathConfigRequest request);
}
