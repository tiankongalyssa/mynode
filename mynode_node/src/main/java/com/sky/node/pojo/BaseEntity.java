package com.sky.node.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class BaseEntity {
    @JsonIgnore
    protected Date createTime;
    @JsonIgnore
    protected String createUser;
    @JsonIgnore
    protected Date modofiedTime;
    @JsonIgnore
    protected String modofiedUser;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getModofiedTime() {
        return modofiedTime;
    }

    public void setModofiedTime(Date modofiedTime) {
        this.modofiedTime = modofiedTime;
    }

    public String getModofiedUser() {
        return modofiedUser;
    }

    public void setModofiedUser(String modofiedUser) {
        this.modofiedUser = modofiedUser;
    }
}
