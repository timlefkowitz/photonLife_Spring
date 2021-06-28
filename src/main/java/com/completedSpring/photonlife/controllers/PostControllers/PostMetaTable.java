package com.completedSpring.photonlife.controllers.PostControllers;

import javax.persistence.*;


@Entity
@Table(name="PostMetaTable")
public class PostMetaTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PostId;

    @Column(nullable = false, length = 100)
    private String Key;

    @Column(nullable = false, length = 100)
    private String Content;

}
