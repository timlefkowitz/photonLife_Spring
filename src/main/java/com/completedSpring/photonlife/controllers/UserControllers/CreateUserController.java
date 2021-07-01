package com.completedSpring.photonlife.controllers.UserControllers;


import com.completedSpring.photonlife.models.Users.User;
import com.completedSpring.photonlife.repos.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class CreateUserController {

    //// Create an instance

    private final UsersRepository usersDao;
//    private TimeStamp RegisteredAt;

    public CreateUserController(UsersRepository usersDao) {
        this.usersDao = usersDao;
    }

    /////////////// Create Controllers

    @GetMapping("/create")
    public String IndexForCreate(){
        return"orders/create";
    }

    @PostMapping("/create")
    public String addNewOrder(@RequestParam(name="firstName") String firstName,@RequestParam(name="middleName") String middleName,@RequestParam(name="lastName") String lastName,@RequestParam(name="mobile") long mobile,@RequestParam(name="email") String email,@RequestParam(name="userName") String userName, @RequestParam(name="passwordHash") String passwordHash){


        User n = new Users();
        n.setFirstName(firstName);
        n.setMiddleName(middleName);
        n.setLastName(lastName);
        n.setMobile(mobile);
        n.setEmail(email);
        n.setUserName(userName);
        n.setPasswordHash(passwordHash);
        // learn to deal with dates
//        n.setRegisteredAt(RegisteredAt);
        n.setEmail(email);
        usersDao.save(n);
        return "redirect:/show";
    }
}
