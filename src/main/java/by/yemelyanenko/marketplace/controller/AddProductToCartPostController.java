package by.yemelyanenko.marketplace.controller;

import by.yemelyanenko.marketplace.entity.Product;
import by.yemelyanenko.marketplace.model.CartInfo;
import by.yemelyanenko.marketplace.model.CartItemInfo;
import by.yemelyanenko.marketplace.services.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller

public class AddProductToCartPostController {

    @Autowired
    private ProductService productService;

    @PostMapping("/cart/add")
    public String addProductToCart(@RequestParam Long productId, HttpSession httpSession){
        CartInfo cart = (CartInfo) httpSession.getAttribute("cart");



        Optional<Product> product = productService.takeProductByID(productId);
        if(product.isPresent()){
            cart.addItem(CartItemInfo.builder()
                    .productId(product.get().getId())
                    .productName(product.get().getProductName())
                    .price(product.get().getPrice())
                    .quantity(1)
                    .build());
            httpSession.setAttribute("cart", cart);
        }

        return "redirect:/";
    }
}
