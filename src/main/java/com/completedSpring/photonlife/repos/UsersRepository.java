package com.completedSpring.photonlife.repos;

import com.completedSpring.photonlife.models.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {


    //This is like an example of things you can do here within the repo./
//    User findByUsername(String username);
}
