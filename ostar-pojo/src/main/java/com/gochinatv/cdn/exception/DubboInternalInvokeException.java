package com.gochinatv.cdn.exception;

/**
 * DUBBO服务调用异常
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 11:08
 */
public class DubboInternalInvokeException extends RuntimeException
{
    public DubboInternalInvokeException(){}

    public DubboInternalInvokeException(String message)
    {
        super(message);
    }

    public DubboInternalInvokeException(Throwable cause)
    {
        super(cause);
    }

    public DubboInternalInvokeException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
