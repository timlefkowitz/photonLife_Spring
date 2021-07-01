package com.completedSpring.photonlife.daos;


import com.completedSpring.photonlife.models.Users.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Post, Long> {


}
