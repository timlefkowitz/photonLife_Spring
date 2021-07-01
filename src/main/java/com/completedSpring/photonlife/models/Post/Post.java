package com.completedSpring.photonlife.models.Users;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String AuthorId;

    @Column(nullable = false, length = 100)
    private String ParentId;

    @Column(nullable = false, length = 100)
    private String Title;

    @Column(nullable = false, length = 100)
    private String MetaTitle;

    @Column(nullable = false, length = 50)
    private String Slug;

    @Column(nullable = false, length = 50)
    private String Summary;

    /// This is for
    @Column(name = "Published")
    private java.sql.Date LastLogin;

    @Column(name = "CreatedAt")
    private java.sql.Timestamp publishedOn;

    @Column(name = "UpdatedAt")
    private java.sql.Timestamp publishedOn;

    @Column(name = "PublishedAt")
    private java.sql.Timestamp publishedOn;

    @Column(nullable = false, length = 50)
    private String content;

    @Column(nullable = false, length = 250)
    private String passwordHash;

    ////// DATE COLUMNS ARE HERE BASED ON MY DATABASE DESIGN


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
    private List<com.completedSpring.photonlife.models.Post.Post> posts;


    public Post(long id, String authorId, String parentId, String title, String metaTitle, String slug, String summary, Date lastLogin, Timestamp publishedOn, Timestamp publishedOn1, Timestamp publishedOn2, String content, String passwordHash, String ad, String profile, String email, String email1, String email2, List<com.completedSpring.photonlife.models.Post.Post> posts) {
        this.id = id;
        AuthorId = authorId;
        ParentId = parentId;
        Title = title;
        MetaTitle = metaTitle;
        Slug = slug;
        Summary = summary;
        LastLogin = lastLogin;
        this.publishedOn = publishedOn;
        this.publishedOn = publishedOn1;
        this.publishedOn = publishedOn2;
        this.content = content;
        this.passwordHash = passwordHash;
        this.ad = ad;
        this.profile = profile;
        this.email = email;
        this.email = email1;
        this.email = email2;
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(String authorId) {
        AuthorId = authorId;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getMetaTitle() {
        return MetaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        MetaTitle = metaTitle;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public Date getLastLogin() {
        return LastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        LastLogin = lastLogin;
    }

    public Timestamp getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Timestamp publishedOn) {
        this.publishedOn = publishedOn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<com.completedSpring.photonlife.models.Post.Post> getPosts() {
        return posts;
    }

    public void setPosts(List<com.completedSpring.photonlife.models.Post.Post> posts) {
        this.posts = posts;
    }
}
