package com.example.case_module3.models;

import java.sql.Date;

public class User {
    private int customerId;
    private String fullName;
    private Date birthDay;
    private String email;
    private String numberPhone;
    private String address;
    private String userName;
    private String passWord;

    public User() {
    }

    public User(int customerId, String fullName, Date birthDay, String email, String numberPhone, String address, String userName, String passWord) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.numberPhone = numberPhone;
        this.address = address;
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
