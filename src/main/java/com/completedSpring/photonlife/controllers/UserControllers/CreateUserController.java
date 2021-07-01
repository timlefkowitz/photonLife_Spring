package com.completedSpring.photonlife.controllers.UserControllers;


import com.completedSpring.photonlife.models.Users.User;
import com.completedSpring.photonlife.repos.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class CreateUserController {

    //// Create an instance

    private final UsersRepository usersDao;
    private PasswordEncoder passwordHash;



//    private TimeStamp RegisteredAt;

    public CreateUserController(UsersRepository usersDao, PasswordEncoder passwordHash) {
        this.usersDao = usersDao;
    }

    /////////////// Create Controllers

    @GetMapping("/create")
    public String IndexForCreate(Model model){
        model.addAttribute("user", new User());
        return"users/create";
    }

    @PostMapping("/create")
    public String addNewOrder(@ModelAttribute User user,@ModelAttribute(name="firstName") String firstName, @ModelAttribute(name="middleName") String middleName, @ModelAttribute(name="lastName") String lastName, @ModelAttribute(name="mobile") long mobile, @ModelAttribute(name="email") String email, @ModelAttribute(name="userName") String userName){

        String Hash = passwordHash.encode(user.getPasswordHash());

        User n = new User();
        n.setFirstName(firstName);
        n.setMiddleName(middleName);
        n.setLastName(lastName);
        n.setMobile(mobile);
        n.setEmail(email);
        n.setUserName(userName);
        n.setPasswordHash(Hash);
        // learn to deal with dates
//        n.setRegisteredAt(RegisteredAt);
        n.setEmail(email);
        usersDao.save(n);
        return "redirect:/show";
    }
}
