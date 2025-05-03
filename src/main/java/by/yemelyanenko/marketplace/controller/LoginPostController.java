package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.User;
import by.yemelyanenko.marketplace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class LoginPostController {

    private String REDIRECT_PATH;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String addUser(@ModelAttribute("user") User user, Model model) {

        Optional<User> userOptional = userRepository.findByUsername(user.getUsername());

        REDIRECT_PATH = userOptional.map(value -> value.getRole().toLowerCase()).orElse("login");

         return "redirect:/" + REDIRECT_PATH;
    }

}
