package com.gochinatv.cdn.service.security;

import com.gochinatv.cdn.dto.security.systemrole.SystemRoleRequest;
import com.gochinatv.cdn.dto.security.systemrole.SystemRoleResponse;
import com.gochinatv.cdn.po.security.SystemRoleInfo;
import com.gochinatv.cdn.service.IService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 系统用户服务
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:29
 */
@Path("system/role")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface SystemRoleService extends IService<SystemRoleInfo>
{
    @POST
    @Path("findRolesByUserId")
    SystemRoleResponse findRolesByUserId(SystemRoleRequest request);
}
