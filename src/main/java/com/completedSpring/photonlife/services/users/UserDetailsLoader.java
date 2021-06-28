package com.completedSpring.photonlife.services.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class AuthenticationController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }
}