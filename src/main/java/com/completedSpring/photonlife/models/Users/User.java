package com.completedSpring.photonlife.models.Users;

import com.completedSpring.photonlife.models.Post.Post;

import javax.persistence.*;
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
    private String lastName;

    @Column(nullable = false, length = 100)
    private String middleName;

    @Column(nullable = false, length = 100)
    private String mobile;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String userName;

    @Column(nullable = false, length = 250)
    private String passwordHash;

    ////// DATE COLUMNS ARE HERE BASED ON MY DATABASE DESIGN


    /// This is for
    @Column(name = "LastLogin")
    private java.sql.Date LastLogin;

    @Column(name = "RegisteredAt")
    private java.sql.Timestamp publishedOn;

    @Column(nullable = false, length = 250)
    private String ad;


        //Author details to be displayed on the author page
    @Column(nullable = false, length = 50)
    private String profile;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Post> posts;

    /*
    ------------------------------------------------------------------------------------------------------------
     */ //          Constructors


    public User() {
    }

    //Create
    public User(String userName, String email, String password, List<Post> posts) {
        this.userName = userName;
        this.email = email;
        this.passwordHash = password;
        this.posts = posts;

        // i want to take firstname and lastname off for now
//        this.firstName = firstName;
//        this.lastName = lastName;
    }


    // READ

    public User(Long id, String email, String userName, String password, List<Post> posts){
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.passwordHash = password;
        this.posts= posts;
    }



    //Copy
    public User(User copy){
        id = copy.id;
        email = copy.userName;
        userName = copy.userName;
        passwordHash = copy.passwordHash;
    }




    //Update constructor

    public User(long id, String userName, String email, String password, List<Post> posts) {
        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passwordHash = password;

        // Unsure if i can just add this.post here. because i would have to target the same post when posted?
        this.posts = posts;
    }






    /*
    ------------------------------------------------------------------------------------------------------------
     */

    // Getters and Setters


//    public long getId() {
//        return id;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getUserName() {
//        return userName;
//    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public String getEmail() {
//        return email;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return passwordHash;
    }

    public void setPassword(String password) {
        this.passwordHash = password;
    }
//    public List<Ad> getAd(){
//        return ad;
//    }
//
//    public void setAd(<List<Ad> ad){
//        this.ad = ad;
//    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getOrderNumber() {
    }
}