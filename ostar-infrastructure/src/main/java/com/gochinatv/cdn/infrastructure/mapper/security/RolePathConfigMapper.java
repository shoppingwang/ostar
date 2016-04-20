package com.gochinatv.cdn.infrastructure.mapper.security;

import com.gochinatv.cdn.dto.security.systemauth.RolePathConfig;
import com.gochinatv.cdn.infrastructure.util.MyMapper;

import java.util.List;

/**
 * 角色、资源对应关系
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 17:28
 */
public interface RolePathConfigMapper extends MyMapper<RolePathConfig>
{
    /**
     * 根据模块代码查询可用角色、资源对应关系
     *
     * @param moduleCode 模块代码
     *
     * @return 角色、资源对应关系
     */
    List<RolePathConfig> findAllRolePathByModuleCode(String moduleCode);
}
