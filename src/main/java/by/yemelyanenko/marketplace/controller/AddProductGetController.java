package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class AddProductGetController {

    @GetMapping("/add")
    public String addProductGet(Model model){
        model.addAttribute("product", new Product());
        return "addproduct";
    }
}
