package com.gochinatv.cdn.infrastructure.mapper.security;

import com.gochinatv.cdn.infrastructure.util.MyMapper;
import com.gochinatv.cdn.po.security.SystemRoleInfo;

import java.util.List;

/**
 * 系统角色信息
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:45
 */
public interface SystemRoleInfoMapper extends MyMapper<SystemRoleInfo>
{
    /**
     * 根据用户ID查询用户角色信息
     *
     * @param userId 用户ID
     *
     * @return 用户角色信息
     */
    List<SystemRoleInfo> findRolesByUserId(long userId);
}
