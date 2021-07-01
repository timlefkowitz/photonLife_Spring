package com.completedSpring.photonlife.models.Post;

import javax.persistence.Column;

public class PostCategoryTable {

    @Column(nullable = false, length = 100)
    private Long PostId;

    @Column(nullable = false, length = 100)
    private String ParentId;
}
