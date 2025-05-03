package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.Product;
import by.yemelyanenko.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexGetController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String  getIndex(Model model){

        List<Product> products  = productRepository.findAll();
        model.addAttribute("products",products);
        return "index";
    }
}
