package com.completedSpring.photonlife.models.Post;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CategoryTableandPostCategoryTable {

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
    private String Content;
}
