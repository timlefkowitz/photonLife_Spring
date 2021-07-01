package com.completedSpring.photonlife.models.Post;

import jdk.jfr.DataAmount;

import javax.persistence.*;


@Entity
@Table(name="postMeta")
public class PostMeta {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private long PostId;

    @MapKey
    private long key; ///// no way did i just make a mapkey?
    //////////////////      how cool!!!!!!!!!!

    @Column(nullable = false, length = 1000)
    private String content;

    ///{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}
    //////////////////////////////////////////       constructors


    public PostMeta(long id, long postId, long key, String content) {
        this.id = id;
        PostId = postId;
        this.key = key;
        this.content = content;
    }


    //{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}{}{}{}{}{}{}{}{}{}{}}

    ///////////////////////                             Getters and Setters


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

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



