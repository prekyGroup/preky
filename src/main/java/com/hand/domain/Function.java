package com.hand.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 功能模块类
 * Created by huiyu.chen on 2017/7/3.
 *
 */
@Entity
@Table(name = "function")
public class Function extends BaseBean {

    @Id
    @GeneratedValue
    private Integer functionId;

    @NotNull
    private String functionCode;

    @NotNull
    private String functionName;

    private String functionDescription;

    @NotNull
    private String functionApi;

    public Function() {
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionDescription() {
        return functionDescription;
    }

    public void setFunctionDescription(String functionDescription) {
        this.functionDescription = functionDescription;
    }

    public String getFunctionApi() {
        return functionApi;
    }

    public void setFunctionApi(String functionApi) {
        this.functionApi = functionApi;
    }
}
