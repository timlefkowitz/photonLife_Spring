package com.completedSpring.photonlife.models.Post;

import javax.persistence.*;

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
}
