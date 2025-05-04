package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddUserGetController {

    @GetMapping("/user/add")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "adduser";
    }
}
