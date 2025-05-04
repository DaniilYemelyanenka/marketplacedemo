package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.Product;
import by.yemelyanenko.marketplace.entity.User;
import by.yemelyanenko.marketplace.model.CartInfo;
import by.yemelyanenko.marketplace.repository.ProductRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class IndexGetController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String  getIndex(Model model, HttpSession httpSession){




        List<Product> products  = productRepository.findAll();


        CartInfo cart  = (CartInfo) httpSession.getAttribute("cart");

        if(cart == null){
            cart = new CartInfo();
            httpSession.setAttribute("cart",cart);
        }



        //TODO refactor to controller advanced
        model.addAttribute("cart", cart);
        model.addAttribute("products",products);
        model.addAttribute("user", new User("Ivan", "12345678","USER"));

        return "index";
    }
}
