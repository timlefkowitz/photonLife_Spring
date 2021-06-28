package com.completedSpring.photonlife.daos;


import com.completedSpring.photonlife.models.Post.Post;
import com.completedSpring.photonlife.models.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {

//    @Query("From User as a where a.title like %:term% or a.description like %:term%")

    @Query
    List<Post> searchByUser(@Param("term") String term);

    Post findByTitle(String title); // select * from ads where title = ?
    Post findFirstByTitle(String title); // select * from ads where title = ? limit 1
    Post findByTitleLike(String searchPattern);  //find by title "%INPUT%"



}