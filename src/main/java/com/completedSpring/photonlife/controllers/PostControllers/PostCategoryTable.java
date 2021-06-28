package com.completedSpring.photonlife.controllers.PostControllers;


import javax.persistence.*;

@Entity
@Table(name="PostCateGoryTable")
public class PostCategoryTable {

    public PostCategoryTable(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PostId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CategoryId;


/*
================================================================================
 */// Getters and Setters


    public long getPostId() {
        return PostId;
    }

    public void setPostId(long postId) {
        PostId = postId;
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }
}
