package com.completedSpring.photonlife.models.Post;

import com.completedSpring.photonlife.models.Users.User;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name="postCommentTable")
public class PostCommentTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String PostId;

    @Column(nullable = false, length = 100)
    private String ParentId;

    @Column(nullable = false, length = 100)
    private String Title;

    ///  [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]    DateStampEnties


    @Column(name = "Published")
    private java.sql.Date published;

    @Column(name = "CreatedAt")
    private java.sql.Timestamp CreatedAt;

    @Column(name = "PublishedAt")
    private java.sql.Timestamp PublishedAt;


    @Column(nullable = false, length = 50)
    private String content;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
//    private List<User> users;

    ///  [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]    Constructors

    public PostCommentTable(long id, String postId, String parentId, String title, Date published, Timestamp createdAt, Timestamp createdAt1, String content) {
        this.id = id;
        PostId = postId;
        ParentId = parentId;
        Title = title;
        this.published = published;
        CreatedAt = createdAt;
        CreatedAt = createdAt1;
        this.content = content;

    }


    ///  [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]    Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostId() {
        return PostId;
    }

    public void setPostId(String postId) {
        PostId = postId;
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
