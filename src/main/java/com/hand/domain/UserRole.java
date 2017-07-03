package com.hand.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 用户角色关系类
 * Created by huiyu.chen on 2017/7/3.
 *
 */
@Entity
@Table(name = "user_role")
public class UserRole extends BaseBean {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer roleId;

    public UserRole() {
    }

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
