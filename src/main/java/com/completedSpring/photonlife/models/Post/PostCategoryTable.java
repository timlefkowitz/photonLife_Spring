package com.completedSpring.photonlife.models.Post;

import javax.persistence.Column;

public class PostCategoryTable {

    @Column(nullable = false, length = 100)
    private Long PostId;

    @Column(nullable = false, length = 100)
    private String ParentId;

    //// [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][
    //
    //    Constructors || programming is fun, It is fun to look at java
    //
    // [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][ [][][][][]][


    public PostCategoryTable(Long postId, String parentId) {
        PostId = postId;
        ParentId = parentId;
    }

    public Long getPostId() {
        return PostId;
    }

    public void setPostId(Long postId) {
        PostId = postId;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }
}
