package com.gochinatv.cdn.security.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gochinatv.cdn.dto.security.systemrole.SystemRoleRequest;
import com.gochinatv.cdn.dto.security.systemrole.SystemRoleResponse;
import com.gochinatv.cdn.infrastructure.mapper.security.SystemRoleInfoMapper;
import com.gochinatv.cdn.po.security.SystemRoleInfo;
import com.gochinatv.cdn.pojo.Constants;
import com.gochinatv.cdn.service.impl.BaseService;
import com.gochinatv.cdn.service.security.SystemRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 系统角色服务
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:36
 */
@Service(protocol = {"dubbo", "rest"})
public class SystemRoleServiceImpl extends BaseService<SystemRoleInfo> implements SystemRoleService
{
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SystemRoleInfoMapper systemRoleInfoMapper;

    @Override
    public SystemRoleResponse findRolesByUserId(SystemRoleRequest request)
    {
        SystemRoleResponse response = new SystemRoleResponse();
        try
        {
            response.setSystemRoleInfos(systemRoleInfoMapper.findRolesByUserId(request.getUserId()));
        }
        catch (Exception e)
        {
            logger.error("查询用户角色信息出错", e);
            response.setCodeAndMessage(Constants.FAIL_CODE, "查询用户角色信息出错");
        }

        return response;
    }

    public void setSystemRoleInfoMapper(SystemRoleInfoMapper systemRoleInfoMapper)
    {
        this.systemRoleInfoMapper = systemRoleInfoMapper;
    }
}
