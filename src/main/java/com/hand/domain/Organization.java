package com.hand.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 组织类
 * Created by huiyu.chen on 2017/7/3.
 */
@Entity
@Table(name = "organization")
public class Organization extends BaseBean {

    @Id
    @GeneratedValue
    private Integer organizationId;

    @NotNull
    private String organizationName;

    private String organizationDescription;

    @NotNull
    private Integer organizationParentId;

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationDescription() {
        return organizationDescription;
    }

    public void setOrganizationDescription(String organizationDescription) {
        this.organizationDescription = organizationDescription;
    }

    public Integer getOrganizationParentId() {
        return organizationParentId;
    }

    public void setOrganizationParentId(Integer organizationParentId) {
        this.organizationParentId = organizationParentId;
    }
}
