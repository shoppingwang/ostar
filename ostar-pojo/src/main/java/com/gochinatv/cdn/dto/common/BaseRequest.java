package com.gochinatv.cdn.dto.common;

import com.gochinatv.cdn.po.security.SystemAccountInfo;
import com.gochinatv.cdn.po.security.SystemUserInfo;
import com.gochinatv.cdn.pojo.BaseSerializer;

import java.util.Map;

/**
 * 远程方法调用基础请求对象，所有远程方法调用请求对象继承自此
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/28 10:37
 */
public class BaseRequest extends BaseSerializer
{
    //当前用户信息
    private SystemUserInfo currentUser;

    //当前账户信息
    private SystemAccountInfo currentAccount;

    public SystemUserInfo getCurrentUser()
    {
        return currentUser;
    }

    public void setCurrentUser(SystemUserInfo currentUser)
    {
        this.currentUser = currentUser;
    }

    public SystemAccountInfo getCurrentAccount()
    {
        return currentAccount;
    }

    public void setCurrentAccount(SystemAccountInfo currentAccount)
    {
        this.currentAccount = currentAccount;
    }
}
