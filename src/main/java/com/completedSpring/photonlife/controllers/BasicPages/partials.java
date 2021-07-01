package com.completedSpring.photonlife.controllers.BasicPages;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class partials {

    @GetMapping("/partials")
    public String show(Model view){
        return"partials/partials";
    }




}
