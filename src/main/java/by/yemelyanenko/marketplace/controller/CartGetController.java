package by.yemelyanenko.marketplace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartGetController {

    @GetMapping("/cart")
    public String getCart(){
        return "cart";
    }
}
