package com.completedSpring.photonlife.controllers.PostControllers;

import javax.persistence.*;


@Entity
@Table(name="postReview")
public class PostReviewTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long AuthorId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ParentId;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String MetaTitle;

    @Column(nullable = false, length = 100)
    private String Slug;

    @Column(nullable = false, length = 100)
    private String summary;

    @Column(nullable = false, length = 100)
    private Boolean published;


    //look up how to create this for date
    @Column(nullable = false, length = 100)
    private String createdAt;

    @Column(nullable = false, length = 100)
    private String updatedAt;

    @Column(nullable = false, length = 100)
    private String publishedAt;


    // the comment!!!!!
    @Column(nullable = false, length = 100)
    private String Content;


    private PostReviewTable(){

    }

    /*
    --------------------------------------------------------------
     *///// GETTERS AND SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(long authorId) {
        AuthorId = authorId;
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
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
