package com.completedSpring.photonlife.controllers.BasicPages;


import com.completedSpring.photonlife.daos.PostRepository;
import com.completedSpring.photonlife.daos.UsersRepository;
import com.completedSpring.photonlife.models.Post.Post;
import com.completedSpring.photonlife.models.Users.User;
import com.completedSpring.photonlife.services.Email.EmailService;
import com.completedSpring.photonlife.services.Features.SearchFeatureStringService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdsController {


    private final SearchFeatureStringService searchFeatureStringService;
    private final EmailService emailService;

    //  Private field to store injected repository;
    private PostRepository adsDao;
    private UsersRepository usersDao;


    public AdsController(PostRepository adDao, UsersRepository usersDao, SearchFeatureStringService searchFeatureStringService, EmailService emailService){
        this.adsDao = adDao;
        this.usersDao = usersDao;
        this.searchFeatureStringService = searchFeatureStringService;
        this.emailService = emailService;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        List<Ad> adsList = adsDao.findAll();
        model.addAttribute("ads", adsDao.findAll());
        model.addAttribute("noAdsFound", adsList.size() == 0);
        model.addAttribute("topAd", adsDao.findByTitle("bicycle north side"));
        model.addAttribute("searchAd", adsDao.findByTitleLike("%childcare%"));
//        String shortUserName = stringService.shortenString(Ad.getOwner().getUserName());
//        model.addAttribute("shortUserName", shortUserName);
        return "ads/index";
    }



    ////         Show


    @GetMapping("/ads/{id}")
    public String show(@PathVariable long id, Model model){

        Post ad = adsDao.getById(id);
        model.addAttribute("adId", id);
        model.addAttribute("ad", adsDao.getById(id));

        String shortUserName = searchFeatureStringService.shortenString(Post.getOwner().getUserName());
        model.addAttribute("shortUsername", shortUserName);
        return "ads/show";
    }




    //          Create

    @GetMapping("/ads/create")
    public String showForm(){
        return "ads/create";
    };


    @PostMapping("/ads/create")
    public String save(@ModelAttribute Post ad){
        User user = usersDao.getById(1l);
        //ad newAd = new Ad(title, description, user, null, null);
//        Ad newAd = new Ad(title, description, user, null);
        ad.setOwner(user);
        Post savedAd = adsDao.save(ad);


        //   Send out a Email to the creator of the ad.
        emailService.prepareAndSend(ad, "You have created a new ad", "here is an email body");    //      .sendEmail(user.getEmail());
        return "redirect:/ads/" + savedAd.getId();
    }

    // doubled up methods

//    @GetMapping("/ads/show")
//    public String show(@PathVariable long id, Model model){
//        model.addAttribute("adId", id);
//        model.addAttribute("ad", adsDao.getById(id));
//        return "ads/show";
//    }


    @GetMapping("/ads/{id}/edit")
    public String showEditFrom(Model model, @PathVariable long id) {
        // find an ad
        Post adToEdit = adsDao.getById(id);
        model.addAttribute("ad", adToEdit);
        return "ads/edit";
    }

    @PostMapping("/post/{id}/edit")
    @ResponseBody
    public String update(@PathVariable long id,
                         @RequestParam(name = "title") String title,
                         @RequestParam(name = "description") String desc){
        // find an ad
        Post foundAd = adsDao.getById(id); // select * from ads where id = ?
        // edit the ad
        foundAd.setTitle(title);
        foundAd.setDescription(desc);
        // save the changes
        adsDao.save(foundAd); // update ads set title = ? where id = ?
        return "ad updated";
    }

    @PostMapping("/ads/{id}/delete")
    public String destroy(@PathVariable long id){
        adsDao.deleteById(id);
        return "redirect:/ads";
    }

    @GetMapping("/search")
    public String searchResults(Model model, @RequestParam(name = "term") String term){
//        List<Ad> ads = adsDao.searchByTitle(term);
//        model.addAttribute("ads", ads);
        return "ads/index";
    }
}

