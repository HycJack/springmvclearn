package com.HycJack.user.entity;

import java.io.Serializable;

/**
  * <p></p>
  * @author huangyicao 2017/7/31 14:12
  * @param
  * @return
  * @modificationHistory=========================逻辑或功能性重大变更记录
  * @modify by user: {修改人} 2017/7/31
  * @modify by reason:{原因}
 */
public class Role implements Serializable {

    private static final long serialVersionUID = -3773106741210716874L;

    private Integer id;

    private String roleName;

    private String roleDesc;

    /**
     * 角色类型，普通角色：1和岗位：2
     */
    private Integer roleType;

    private String beginTime;

    private String endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", id=" + id +
                ", roleDesc='" + roleDesc + '\'' +
                ", roleType=" + roleType +
                '}';
    }
}
