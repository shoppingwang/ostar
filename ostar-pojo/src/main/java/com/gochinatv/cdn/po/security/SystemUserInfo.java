package com.gochinatv.cdn.po.security;

import com.gochinatv.cdn.pojo.BaseSerializer;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * 系统用户信息
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/24 15:10
 */
public class SystemUserInfo extends BaseSerializer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String loginName;

    private String userPassword;

    private Integer userStatus;

    private String userName;

    private String userEmail;

    private String userPhoneNo;

    private Long parentUserId;

    private Integer allowCreateSub;

    private Timestamp insertDate;

    private Timestamp updateDate;

    private Timestamp expireDate;

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }

    public Integer getUserStatus()
    {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus)
    {
        this.userStatus = userStatus;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNo()
    {
        return userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo)
    {
        this.userPhoneNo = userPhoneNo;
    }

    public Long getParentUserId()
    {
        return parentUserId;
    }

    public void setParentUserId(Long parentUserId)
    {
        this.parentUserId = parentUserId;
    }

    public Integer getAllowCreateSub()
    {
        return allowCreateSub;
    }

    public void setAllowCreateSub(Integer allowCreateSub)
    {
        this.allowCreateSub = allowCreateSub;
    }

    public Timestamp getInsertDate()
    {
        return insertDate;
    }

    public void setInsertDate(Timestamp insertDate)
    {
        this.insertDate = insertDate;
    }

    public Timestamp getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate)
    {
        this.updateDate = updateDate;
    }

    public Timestamp getExpireDate()
    {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate)
    {
        this.expireDate = expireDate;
    }
}
