package com.completedSpring.photonlife.controllers.UserControllers;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class AdminController {


    @Controller
    public class UsersController {

        @GetMapping("/users/admin")
        public String getAllAdmins(Model model) {
            List<User> admins = new ArrayList<>();
            model.addAttribute("admins", admins);
            return "users";
        }

        @GetMapping("/admin")
        public String getUserString(Model model) {
            return "admin";
        }
    }



}
