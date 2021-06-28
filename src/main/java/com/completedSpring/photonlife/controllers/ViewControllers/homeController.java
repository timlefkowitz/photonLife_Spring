package com.completedSpring.photonlife.controllers.BasicPages;

import com.completedSpring.photonlife.daos.PostRepository;
import com.completedSpring.photonlife.daos.UsersRepository;
import com.completedSpring.photonlife.models.Post.Post;
import com.completedSpring.photonlife.services.Email.EmailService;
import com.completedSpring.photonlife.services.Features.SearchFeatureStringService;
import org.springframework.web.bind.annotation.*;

public class homeController {


    private final SearchFeatureStringService searchFeatureStringService;
    private final EmailService emailService;

    //  Private field to store injected repository;
    private PostRepository postDao;
    private UsersRepository usersDao;



    /*
    {}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
     *////}}}}}}}}}}}}}}}}}}}}}}       Constructors

    public homeController(SearchFeatureStringService searchFeatureStringService, EmailService emailService, PostRepository adsDao, UsersRepository usersDao) {
        this.searchFeatureStringService = searchFeatureStringService;
        this.emailService = emailService;
        this.postDao = adsDao;
        this.usersDao = usersDao;
    }



    @PostMapping("/home/")
    @ResponseBody
    public String homeWithNoId(@PathVariable long id,
                             @RequestParam(name = "title") String title,
                             @RequestParam(name = "description") String desc){
        // find an ad
        Post foundAd = postDao.getById(id); // select * from ads where id = ?
        // edit the ad
        foundAd.setTitle(title);
        foundAd.setDescription(desc);
        // save the changes
        postDao.save(foundAd); // update ads set title = ? where id = ?
        return "home";
    }


    @PostMapping("/home/{id}/")
    @ResponseBody
    public String homeWithId(@PathVariable long id,
                         @RequestParam(name = "title") String title,
                         @RequestParam(name = "description") String desc){
        // find an ad
        Post foundAd = postDao.getById(id); // select * from ads where id = ?
        // edit the ad
        foundAd.setTitle(title);
        foundAd.setDescription(desc);
        // save the changes
        postDao.save(foundAd); // update ads set title = ? where id = ?
        return "ad updated";
    }

    @PostMapping("/post/{id}/edit")
    @ResponseBody
    public String update(@PathVariable long id,
                         @RequestParam(name = "title") String title,
                         @RequestParam(name = "description") String desc){
        // find an ad
        Post foundAd = postDao.getById(id); // select * from ads where id = ?
        // edit the ad
        foundAd.setTitle(title);
        foundAd.setDescription(desc);
        // save the changes
        postDao.save(foundAd); // update ads set title = ? where id = ?
        return "ad updated";
    }


}
