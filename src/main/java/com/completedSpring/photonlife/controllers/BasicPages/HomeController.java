package com.completedSpring.photonlife.controllers.BasicPages;


import com.completedSpring.photonlife.repos.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private final UsersRepository usersDao;

    //    @Autowired
    public HomeController(UsersRepository usersDao) {
        this.usersDao = usersDao;
    }

    // Show Constructors

    @GetMapping("/")
    public String show(Model view){
        return"index";
    }

    @GetMapping("/show/{id}")
    public String showById(@PathVariable Long id, Model view){
        view.addAttribute("ads", usersDao.getById(id));
        return "orders/show";
    }


    // Edit Constructors

    @GetMapping("/show/{id}/edit")
    public String viewEditForm(@PathVariable Long id, Model view)
    {
        view.addAttribute("ads", usersDao.getById(id));
        return "orders/edit";
    }

//    @PostMapping("show/{id}/edit")
//    public String updateOrder(@PathVariable long id, @ModelAttribute User orderToUpdate){
//        usersDao.save(orderToUpdate);
//        return "redirect:/show" + orderToUpdate.getOrderNumber();
//    }

    @GetMapping("show/{id}/delete")
    public String showdelete(@PathVariable Long id, Model view)
    {
        view.addAttribute("ads", usersDao.getById(id));
        return "orders/delete";
    }
//
//    @PostMapping("show/{id}/delete")
//    public String deleteOrder(@PathVariable Long id)
//    {
//        UsersRepository user = usersDao.getById(id);
//        usersDao.delete(user);
//        return "redirect:/show";
//    }




}
