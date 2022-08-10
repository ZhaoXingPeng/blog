package com.zxp.blogapi.entity;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author zxp
 * @since 2022-08-06 11:42:23
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = -94715566900376860L;

    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 角色id
     */
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}

