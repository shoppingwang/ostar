package com.gochinatv.cdn.analysis.filter.dubbo;

import com.alibaba.dubbo.rpc.*;
import com.gochinatv.cdn.analysis.security.CustomUserDetails;
import com.gochinatv.cdn.dto.common.BaseRequest;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 当前用户相关信息获取
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 13:45
 */
public class WebUserInfoAcquireFilter implements Filter
{
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException
    {
        Object[] arguments = invocation.getArguments();
        if (ArrayUtils.isNotEmpty(arguments) && arguments[0] instanceof BaseRequest)
        {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (null != authentication)
            {
                CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();

                BaseRequest request = (BaseRequest) arguments[0];
                request.setCurrentUser(userDetails.getSystemUser());
                request.setCurrentAccount(userDetails.getSystemAccount());
            }
        }

        return invoker.invoke(invocation);
    }
}
