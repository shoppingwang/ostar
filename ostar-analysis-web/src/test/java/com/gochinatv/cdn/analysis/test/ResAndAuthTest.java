package com.gochinatv.cdn.analysis.test;

import org.junit.Test;

/**
 * 资源和权限关系
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 14:27
 */
public class ResAndAuthTest
{
    @Test
    public void testRestAndAuthSql()
    {
                String sql ="SELECT * FROM t_system_resource_info WHERE id IN(" +
                "SELECT DISTINCT resource_id FROM t_system_authority_resource WHERE authority_id IN(" +
                "SELECT authority_id FROM t_system_role_authority WHERE role_id IN(" +
                "SELECT role_id FROM t_system_user_role WHERE user_id  =( " +
                "SELECT id FROM t_system_user_info WHERE username= ? ))))";

        System.out.println(sql);
    }
}
