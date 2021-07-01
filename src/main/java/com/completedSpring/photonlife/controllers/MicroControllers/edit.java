package com.completedSpring.photonlife.controllers.MicroControllers;


import com.completedSpring.photonlife.models.Users.Post;
import com.completedSpring.photonlife.repos.PostRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


public class edit {

    private PostRepository adsDao;


    @GetMapping("/ads/{id}/edit")
    public String showEditFrom(Model model, @PathVariable long id){

        // find an ad
        Post adToEdit = adsDao.getById(id);
        model.addAttribute("ad", adToEdit);
        return "ads/edit";


    }


    @PostMapping("ads/{id}/edit")
    @ResponseBody
    public String update(@PathVariable long id,
                         @RequestParam(name = "title") String title,
                         @RequestParam(name = "description") String desc){

        //find an ad
        Post foundAd = adsDao.getById(id); // select * FROM ads where id = ?
        //edit the ad
        foundAd.setTitle(title);
        //save the changes
        adsDao.save(foundAd);
        return "ad updated";


    }


}
