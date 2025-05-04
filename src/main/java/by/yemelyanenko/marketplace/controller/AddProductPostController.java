package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.Product;
import by.yemelyanenko.marketplace.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class AddProductPostController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addProductPost(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/";
    }
}
