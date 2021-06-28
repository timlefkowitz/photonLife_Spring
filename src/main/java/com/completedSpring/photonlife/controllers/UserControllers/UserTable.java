package com.completedSpring.photonlife.controllers.UserControllers;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserTable {

    private UserTable(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    //    name
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String middleName;

    @Column(nullable = false, length = 100)
    private String lastName;

    //Contact

    @Column(nullable = false, length = 100)
    private String mobile;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String PasswordHash;


    //    dates
    @Column(nullable = false, length = 100)
    private String RegisteredAt;

    @Column(nullable = false, length = 100)
    private String LastLogin;

    @Column(nullable = false, length = 100)
    private String Intro;

    @Column(nullable = false, length = 100)
    private String Profile;


    /*
    ----------------------------------------------------------
     *////// getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String passwordHash) {
        PasswordHash = passwordHash;
    }

    public String getRegisteredAt() {
        return RegisteredAt;
    }

    public void setRegisteredAt(String registeredAt) {
        RegisteredAt = registeredAt;
    }

    public String getLastLogin() {
        return LastLogin;
    }

    public void setLastLogin(String lastLogin) {
        LastLogin = lastLogin;
    }

    public String getIntro() {
        return Intro;
    }

    public void setIntro(String intro) {
        Intro = intro;
    }

    public String getProfile() {
        return Profile;
    }

    public void setProfile(String profile) {
        Profile = profile;
    }
}
