package com.tamboot.admin.system.model;

import com.tamboot.mybatis.core.BaseModel;

public class SystemRoleModel extends BaseModel {
    private static final long serialVersionUID = -5309775038784820343L;

    private String roleCode;

    private String roleName;

    private String roleDesc;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
