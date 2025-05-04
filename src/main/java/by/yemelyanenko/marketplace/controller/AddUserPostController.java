package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.User;
import by.yemelyanenko.marketplace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddUserPostController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/user/add")
    public String addUser(@ModelAttribute("user") User user){
        user.setRole("ROLE_USER");

        userService.addUser(user);

//        Authentication auth =
//                authenticationManager.authenticate(
//                        new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword())
//                );


//        SecurityContextHolder.getContext().setAuthentication(auth);

       return "redirect:/login";
    }
}
