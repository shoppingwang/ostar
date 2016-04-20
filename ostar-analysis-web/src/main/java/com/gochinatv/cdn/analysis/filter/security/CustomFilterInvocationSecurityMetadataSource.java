package com.gochinatv.cdn.analysis.filter.security;

import com.gochinatv.cdn.dto.security.systemauth.RolePathConfig;
import com.gochinatv.cdn.dto.security.systemauth.RolePathConfigRequest;
import com.gochinatv.cdn.dto.security.systemauth.RolePathConfigResponse;
import com.gochinatv.cdn.service.security.RolePathConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import java.util.*;

/**
 * 自定义安全元数据加载
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/29 12:49
 */
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource
{
    private Logger logger = LoggerFactory.getLogger(getClass());

    private AntPathMatcher urlMatcher = new AntPathMatcher();

    private static Map<String, Collection<ConfigAttribute>> pathToAuthorities = new HashMap<>();

    private RolePathConfigService rolePathConfigService;

    private String moduleCode;

    public CustomFilterInvocationSecurityMetadataSource(RolePathConfigService rolePathConfigService, String moduleCode)
    {
        this.rolePathConfigService = rolePathConfigService;
        this.moduleCode = moduleCode;

        loadResourceDefine();
    }

    //加载所有资源
    private void loadResourceDefine()
    {
        logger.debug("--------------开始加载系统资源与权限列表数据--------------");

        RolePathConfigRequest request = new RolePathConfigRequest(moduleCode);
        RolePathConfigResponse response = rolePathConfigService.findAllRolePathByModuleCode(request);

        if (response.isSuccess())
        {
            List<RolePathConfig> rolePathConfigs = response.getRolePathConfigs();
            for (RolePathConfig rolePathConfig : rolePathConfigs)
            {
                String resUrl = rolePathConfig.getResUrl().trim();
                String roleCode = rolePathConfig.getRoleCode().trim();

                ConfigAttribute configAttribute = new SecurityConfig(roleCode);

                Collection<ConfigAttribute> configAttributes = pathToAuthorities.get(resUrl);
                if (null == configAttributes)
                {
                    configAttributes = new ArrayList<>();
                    pathToAuthorities.put(resUrl, configAttributes);
                }

                configAttributes.add(configAttribute);
            }
        }
        else
        {
            throw new RuntimeException("请求角色、资源信息失败。");
        }

        logger.debug("--------------结束加载系统资源与权限列表数据--------------");
    }

    /**
     * 根据请求的资源地址，获取它所拥有的权限
     * 如果是想做到没配的资源默认可以访问的话，那么就返回空或者NULL
     */
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException
    {
        //获取请求的url地址
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        if (requestUrl.contains("?"))
        {
            requestUrl = requestUrl.substring(0, requestUrl.indexOf("?"));
        }

        for (Map.Entry<String, Collection<ConfigAttribute>> pathAuthorities : pathToAuthorities.entrySet())
        {
            String resUrl = pathAuthorities.getKey();
            if (resUrl.contains("?"))
            {
                resUrl = resUrl.substring(0, resUrl.indexOf("?"));
            }

            if (urlMatcher.match(resUrl, requestUrl))
            {
                return pathAuthorities.getValue();
            }
        }

        logger.warn("未获取到当前URL【{}】的访问权限信息，默认将允许访问。", requestUrl);

        return null;
    }

    public Collection<ConfigAttribute> getAllConfigAttributes()
    {
        Set<ConfigAttribute> allAttributes = new HashSet<>();
        for (Map.Entry<String, Collection<ConfigAttribute>> entry : pathToAuthorities.entrySet())
        {
            allAttributes.addAll(entry.getValue());
        }

        return allAttributes;
    }

    public boolean supports(Class<?> clazz)
    {
        return true;
    }
}
