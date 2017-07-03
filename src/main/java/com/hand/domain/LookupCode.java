package com.hand.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 权限类
 * Created by huiyu.chen on 2017/7/3.
 *
 */
@Entity
@Table(name = "lookup_code")
public class LookupCode extends BaseBean {

    @Id
    @GeneratedValue
    private Integer lookupId;

    @NotNull
    private String lookupCode;

    @NotNull
    private String lookupType;

    @NotNull
    private String lookupName;

    private String lookupDescription;

    public LookupCode() {
    }

    public Integer getLookupId() {
        return lookupId;
    }

    public void setLookupId(Integer lookupId) {
        this.lookupId = lookupId;
    }

    public String getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public String getLookupDescription() {
        return lookupDescription;
    }

    public void setLookupDescription(String lookupDescription) {
        this.lookupDescription = lookupDescription;
    }
}
