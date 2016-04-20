package com.gochinatv.cdn.dto.common;

import java.util.Map;

/**
 * 通用响应对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 11:44
 */
public class GenericResponse extends BaseResponse
{
    //通用响应数据
    private Map<String, Object> responseData;

    public Map<String, Object> getResponseData()
    {
        return responseData;
    }

    public void setResponseData(Map<String, Object> responseData)
    {
        this.responseData = responseData;
    }
}
