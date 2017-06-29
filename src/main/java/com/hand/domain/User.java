package com.hand.domain;

/**
 * Created by wankun on 2017/6/29.
 */
public class User extends BaseBean{
    //用户ID
    private Integer userId;
    //账号
    private Integer userNum;
    //密码
    private Integer userPassword;
    //用户名
    private Integer userName;
    //图片
    private Integer userImg;
    //邮箱
    private Integer userMail;
    //手机
    private Integer userPhone;
    //性别
    private Integer userSex;
    //生日
    private Integer userBirthday;
    //状态
    private Integer userStatus;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public Integer getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Integer userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Integer getUserImg() {
        return userImg;
    }

    public void setUserImg(Integer userImg) {
        this.userImg = userImg;
    }

    public Integer getUserMail() {
        return userMail;
    }

    public void setUserMail(Integer userMail) {
        this.userMail = userMail;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Integer userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
