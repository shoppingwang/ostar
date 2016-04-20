package com.gochinatv.cdn.analysis.filter.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import javax.servlet.*;
import java.io.IOException;

/**
 * 自定义请求安全过滤器
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 11:46
 */
public class CustomSecurityFilter extends AbstractSecurityInterceptor implements Filter
{
    private Logger logger = LoggerFactory.getLogger(getClass());

    // 与applicationContext-security.xml里的myFilter的属性securityMetadataSource对应，
    // 其他的两个组件，已经在AbstractSecurityInterceptor定义
    private FilterInvocationSecurityMetadataSource securityMetadataSource;

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource()
    {
        return this.securityMetadataSource;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        FilterInvocation fi = new FilterInvocation(request, response, chain);

        invoke(fi);
    }

    private void invoke(FilterInvocation fi) throws IOException,
            ServletException
    {
        // object为FilterInvocation对象
        // 1.获取请求资源的权限
        // 执行Collection<ConfigAttribute> attributes =
        // SecurityMetadataSource.getAttributes(object);
        InterceptorStatusToken token = super.beforeInvocation(fi);
        try
        {
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        }
        catch (Exception e)
        {
            logger.error("自定义安全过滤器拦截出错", e);
        }
        finally
        {
            super.afterInvocation(token, null);
        }
    }


    public void setSecurityMetadataSource(FilterInvocationSecurityMetadataSource securityMetadataSource)
    {
        this.securityMetadataSource = securityMetadataSource;
    }

    public void init(FilterConfig arg0) throws ServletException
    {
    }

    public void destroy()
    {
    }

    @Override
    public Class<?> getSecureObjectClass()
    {
        // 下面的MyAccessDecisionManager的supports方面必须放回true,否则会提醒类型错误
        return FilterInvocation.class;
    }
}
