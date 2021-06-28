package com.completedSpring.photonlife;


import org.springframework.data.jpa.repository.JpaRepository;

//                                          ObjectsVV, datatype
public interface AdRepository extends JpaRepository<Ad, Long> {



    Ad findAdByTitle(String Title);
    //Search feature
    Ad findAdByTitleLike(String searchPattern); //find bvy title "%INPUT%"


}
