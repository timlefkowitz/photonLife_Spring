package com.completedSpring.photonlife.controllers.UserControllers;

import com.completedSpring.photonlife.repos.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {

    private UsersRepository usersDao;
//    private PasswordEncoder passwordHash;
//
//
//    public UsersController(UsersRepository usersDao, PasswordEncoder passwordHash) {
//        this.usersDao = usersDao;
//    }

    @GetMapping("/show")
    public String show(Model view){
        view.addAttribute("users", usersDao.findAll());
        return"users/users";
    }

//    @GetMapping("/user")
//    public String getUserString(Model model) {
//        return "users";
//    }
}
