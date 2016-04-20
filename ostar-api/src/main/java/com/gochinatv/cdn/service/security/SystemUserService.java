package com.gochinatv.cdn.service.security;

import com.gochinatv.cdn.dto.security.systemuser.LoginUserInfoRequest;
import com.gochinatv.cdn.dto.security.systemuser.LoginUserInfoResponse;
import com.gochinatv.cdn.po.security.SystemUserInfo;
import com.gochinatv.cdn.service.IService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * 系统用户服务
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/24 14:02
 */
@Path("system/user")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface SystemUserService extends IService<SystemUserInfo>
{
    @POST
    @Path("findUserByLoginName")
    LoginUserInfoResponse findUserByLoginName(LoginUserInfoRequest request);
}
