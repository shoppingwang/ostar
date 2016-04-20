package com.gochinatv.cdn.dto.common;

import java.util.Map;

/**
 * 通用请求对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 11:43
 */
public class GenericRequest extends BaseRequest
{
    //通用请求数据
    private Map<String, Object> requestData;

    public Map<String, Object> getRequestData()
    {
        return requestData;
    }

    public void setRequestData(Map<String, Object> requestData)
    {
        this.requestData = requestData;
    }
}
