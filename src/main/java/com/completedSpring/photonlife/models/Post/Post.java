package com.completedSpring.photonlife.models.Post;


import com.completedSpring.photonlife.models.Ads.AdImage;
import com.completedSpring.photonlife.models.Users.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="Post")
public class Post {


    @ManyToOne
    @JoinColumn (name = "owner_id")
    private User owner;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //All ads have a ad.title
    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;

//    @OneToOne
//    private User owner;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ad")
    private List<AdImage> images;





    /*
    ----------------------------------------------------------------------------------------------
     *////              Constructors


    public Post() {
    }

    public Post(long id, String title, String description, User user, List<AdImage> images) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.images = images;
    }

    public Post(String title, String description, User owner, List<AdImage> images) {
        this.title = title;
        this.description = description;
        this.owner = owner;
        this.images = images;
    }

    public static User getOwner() {
        return null;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AdImage> getImages() {
        return images;
    }

    public void setImages(List<AdImage> images) {
        this.images = images;
    }

//    public static User getOwner() {
//        return owner;
//    }

//    public void setOwner(User owner) {
//        this.owner = owner;
//    }


    public void setOwner(User owner) {
        this.owner = owner;
    }
}
