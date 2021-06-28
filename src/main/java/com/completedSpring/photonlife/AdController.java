package com.completedSpring.photonlife;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {

    private final AdRepository adDao;

    public AdController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ad", adDao.findAll());
        model.addAttribute("topAd", adDao.findAdByTitle("rad bike"));

                                                                    // "%" + input + "%"
        model.addAttribute("searchAd", adDao.findAdByTitleLike("rad bike"));
        return "adindex";
    }
}
