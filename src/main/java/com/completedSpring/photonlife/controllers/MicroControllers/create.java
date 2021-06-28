package com.completedSpring.photonlife.controllers.MicroControllers;


import com.completedSpring.photonlife.daos.PostRepository;
import com.completedSpring.photonlife.daos.UsersRepository;
import com.completedSpring.photonlife.models.Post.Post;
import com.completedSpring.photonlife.models.Users.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class create {

    private PostRepository adsDao;
    private UsersRepository usersDao;

    @GetMapping("/ads/create")
    public String showForm(){
        return "ads/create";
    };


    @PostMapping("/ads/create")
    public String save(@RequestParam(value = "title") String title, @RequestParam(value = "description") String description){
//        ad.setOwner(user);
        User user = usersDao.getById(1l);
        Post newPost = new Post(title, description, user, null);
        Post savedAd = adsDao.save(newPost);
//        emailService.sendEmail(user.getEmail());
        return "redirect:/ads/" + savedAd.getId();
    }

}