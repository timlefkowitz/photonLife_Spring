package com.completedSpring.photonlife.controllers.PostControllers;

import javax.persistence.*;


@Entity
@Table(name="CategoryTableandPostCategoryTable")
public class CategoryTableandPostCategoryTable {

    public CategoryTableandPostCategoryTable(){
        
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ParentId;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String MetaTitle;

    @Column(nullable = false, length = 100)
    private String Content;

    @Column(nullable = false, length = 100)
    private String Slug;


    /*
    [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
     *//// Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }
}
