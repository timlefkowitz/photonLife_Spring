package com.completedSpring.photonlife.repos;

import com.completedSpring.photonlife.models.Post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}
