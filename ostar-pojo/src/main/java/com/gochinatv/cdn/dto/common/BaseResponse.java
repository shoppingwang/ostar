package com.gochinatv.cdn.dto.common;

import com.gochinatv.cdn.pojo.BaseSerializer;
import com.gochinatv.cdn.pojo.Constants;

import java.util.Map;

/**
 * 基础响应对象
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 10:46
 */
public class BaseResponse extends BaseSerializer
{
    private int code = Constants.SUCCESS_CODE;

    private String message;

    private Throwable exception;

    public BaseResponse()
    {

    }

    public BaseResponse(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(int code, String message, Throwable exception)
    {
        this(code, message);

        this.exception = exception;
    }

    public void setCodeAndMessage(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess()
    {
        return Constants.SUCCESS_CODE == this.code;
    }

    public boolean isFail()
    {
        return !isSuccess();
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Throwable getException()
    {
        return exception;
    }

    public void setException(Throwable exception)
    {
        this.exception = exception;
    }
}
