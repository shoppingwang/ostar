package com.gochinatv.cdn.po.security;

import com.gochinatv.cdn.pojo.BaseSerializer;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 系统账户信息
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 10:42
 */
public class SystemAccountInfo extends BaseSerializer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
}
