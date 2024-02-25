package com.yuchen.borrowingsystem.model;

import java.sql.Date;

public class User {

    private Integer userId;
    private String phoneNumber;
    private String password;
    private String userName;
    private Date registrationTime;
    private Date lastLoginTime;
    private Date lastModifiedtime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastModifiedtime() {
        return lastModifiedtime;
    }

    public void setLastModifiedtime(Date lastModifiedtime) {
        this.lastModifiedtime = lastModifiedtime;
    }
}
