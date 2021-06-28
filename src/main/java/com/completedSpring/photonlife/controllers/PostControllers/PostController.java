package com.completedSpring.photonlife.controllers.PostControllers;


import com.completedSpring.photonlife.daos.PostRepository;
import com.completedSpring.photonlife.daos.UsersRepository;

import com.completedSpring.photonlife.services.Email.EmailService;
import com.completedSpring.photonlife.services.Features.SearchFeatureStringService;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    private final SearchFeatureStringService searchFeatureStringService;
//    private final EmailService emailService;



    // Private field to store injected repository;
    private PostRepository postDao;
    private UsersRepository usersDao;

    public PostController(PostRepository postDao, UsersRepository usersDao, SearchFeatureStringService searchFeatureStringService, EmailService emailService){
        this.postDao = postDao;
        this.usersDao = usersDao;
        this.searchFeatureStringService = searchFeatureStringService;
//        this.emailService = EmailService;
    }



    /*
    ======================================================================================================================
     *////////////////////////// Getters and Setters

    public SearchFeatureStringService getStringService() {
        return searchFeatureStringService;
    }

    public PostRepository getAdsDao() {
        return postDao;
    }

    public void setAdsDao(PostRepository adsDao) {
        this.postDao = adsDao;
    }

    public UsersRepository getUsersDao() {
        return usersDao;
    }

    public void setUsersDao(UsersRepository usersDao) {
        this.usersDao = usersDao;
    }

//    public EmailService getEmailService() {
//        return emailService;
//
//    }
}
