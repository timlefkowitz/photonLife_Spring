package com.completedSpring.photonlife.models.Users;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name="post")
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
    private java.sql.Date published;

    @Column(name = "CreatedAt")
    private java.sql.Timestamp CreatedAt;

    @Column(name = "UpdatedAt")
    private java.sql.Timestamp UpdatedAt;

    @Column(name = "PublishedAt")
    private java.sql.Timestamp PublishedAt;

    @Column(nullable = false, length = 50)
    private String content;



    ////// DATE COLUMNS ARE HERE BASED ON MY DATABASE DESIGN


//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
//    private List<User> users;


    //////// Constructors


    public Post(long id, String authorId, String parentId, String title, String metaTitle, String slug, String summary, Date published, Timestamp createdAt, Timestamp updatedAt, Timestamp publishedAt, String content) {
        this.id = id;
        AuthorId = authorId;
        ParentId = parentId;
        Title = title;
        MetaTitle = metaTitle;
        Slug = slug;
        Summary = summary;
        this.published = published;
        CreatedAt = createdAt;
        UpdatedAt = updatedAt;
        PublishedAt = publishedAt;
        this.content = content;
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

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Timestamp getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        CreatedAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        UpdatedAt = updatedAt;
    }

    public Timestamp getPublishedAt() {
        return PublishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        PublishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
}
