package com.completedSpring.photonlife.models.Users;

import com.completedSpring.photonlife.models.Post.Post;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="users")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String middleName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 100)
    private long mobile;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String userName;

    @Column(nullable = false, length = 250)
    private String passwordHash;

    ////// DATE COLUMNS ARE HERE BASED ON MY DATABASE DESIGN

    @Column(name = "RegisteredAt")
    private java.sql.Timestamp subscribedOn;

    @Column(name = "LastLogin")
    private java.sql.Timestamp LastLogin;

    @Column(name = "publishedOn")
    private java.sql.Date publishedOn;

    @Column(nullable = false, length = 50)
    private String Intro;

        //Author details to be displayed on the author page
    @Column(nullable = false, length = 50)
    private String profile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<User> users;

    /*
    ------------------------------------------------------------------------------------------------------------
     */ //          Constructors

    public User(long id, String firstName, String middleName, String lastName, long mobile, String email, String userName, String passwordHash, Timestamp subscribedOn, Timestamp lastLogin, Date publishedOn, String intro, String profile, List<User> users) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.subscribedOn = subscribedOn;
        LastLogin = lastLogin;
        this.publishedOn = publishedOn;
        Intro = intro;
        this.profile = profile;
        this.users = users;
    }






    /*
    ------------------------------------------------------------------------------------------------------------
     */

    // Getters and Setters


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

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Timestamp getSubscribedOn() {
        return subscribedOn;
    }

    public void setSubscribedOn(Timestamp subscribedOn) {
        this.subscribedOn = subscribedOn;
    }

    public Timestamp getLastLogin() {
        return LastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        LastLogin = lastLogin;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public String getIntro() {
        return Intro;
    }

    public void setIntro(String intro) {
        Intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}