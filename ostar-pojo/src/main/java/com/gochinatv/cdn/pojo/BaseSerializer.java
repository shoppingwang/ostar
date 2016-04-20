package com.gochinatv.cdn.pojo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 基础对象序列化
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 10:34
 */
public class BaseSerializer
{
    @Override
    public String toString()
    {
        return JSON.toJSONString(this);
    }
}
