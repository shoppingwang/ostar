package com.gochinatv.cdn.po.security;

import com.gochinatv.cdn.pojo.BaseSerializer;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * 系统角色信息
 * <p>
 * Author   : wangxp
 * <p>
 * DateTime : 2016/3/30 10:25
 */
public class SystemRoleInfo extends BaseSerializer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String roleCode;

    private String roleName;

    private String roleStatus;

    private Timestamp insertDate;

    private Timestamp updateDate;

    private Integer displayOrder;

    public Long getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Long roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleCode()
    {
        return roleCode;
    }

    public void setRoleCode(String roleCode)
    {
        this.roleCode = roleCode;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public String getRoleStatus()
    {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus)
    {
        this.roleStatus = roleStatus;
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

    public Integer getDisplayOrder()
    {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder)
    {
        this.displayOrder = displayOrder;
    }
}
