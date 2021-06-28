package com.completedSpring.photonlife.controllers.MicroControllers;


import com.completedSpring.photonlife.models.Post.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class showCreateForm {

    @GetMapping("/ads/create")
    public String showCreateForm(Model model){

        model.addAttribute("ad", new Post());
        return "create";
    }


}
