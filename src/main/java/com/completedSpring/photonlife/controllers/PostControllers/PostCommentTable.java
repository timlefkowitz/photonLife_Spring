package com.completedSpring.photonlife.controllers.PostControllers;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="postComment")
public class PostCommentTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PostId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ParentId;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private Boolean published;


    //look up how to create this for date
    @Column(nullable = false, length = 100)
    private String createdAt;

    @Column(nullable = false, length = 100)
    private String publishedAt;


    // the comment!!!!!
    @Column(nullable = false, length = 100)
    private String Content;

    public PostCommentTable(){

    }

//    <!--------------------------------------------------------------------->////// Getters and Setters



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return PostId;
    }

    public void setPostId(long postId) {
        PostId = postId;
    }

    public long getParentId() {
        return ParentId;
    }

    public void setParentId(long parentId) {
        ParentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
