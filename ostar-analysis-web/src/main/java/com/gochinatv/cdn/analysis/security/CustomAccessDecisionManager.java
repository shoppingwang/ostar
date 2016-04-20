package com.gochinatv.cdn.analysis.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * 自定义访问决策管理器
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 12:52
 */
public class CustomAccessDecisionManager implements AccessDecisionManager
{
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException
    {
        if (configAttributes == null)
        {
            logger.warn("资源【{}】未纳入权限管理。", object);

            return;
        }

        //所请求的资源拥有的权限(一个资源对多个权限)
        for (ConfigAttribute configAttribute : configAttributes)
        {
            //访问所请求资源所需要的权限
            String needPermission = configAttribute.getAttribute();

            //用户所拥有的权限authentication
            for (GrantedAuthority ga : authentication.getAuthorities())
            {
                if (needPermission.equals(ga.getAuthority()))
                {
                    return;
                }
            }
        }

        throw new AccessDeniedException("没有权限访问" + object);
    }

    /**
     * 启动时候被AbstractSecurityInterceptor调用，决定AccessDecisionManager是否可以执行传递ConfigAttribute。
     */
    public boolean supports(ConfigAttribute attribute)
    {
        return true;
    }

    /**
     * 被安全拦截器实现调用，包含安全拦截器将显示的AccessDecisionManager支持安全对象的类型
     */
    public boolean supports(Class<?> clazz)
    {
        return true;
    }
}
