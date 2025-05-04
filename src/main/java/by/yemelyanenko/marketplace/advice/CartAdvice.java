package by.yemelyanenko.marketplace.advice;

import by.yemelyanenko.marketplace.model.CartInfo;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class CartAdvice {

    @ModelAttribute
    public void addGlobalCart(Model model, HttpSession httpSession){

        CartInfo cart = (CartInfo) httpSession.getAttribute("cart");

        if (cart == null){
            cart = new CartInfo();
            httpSession.setAttribute("cart", cart);
        }
        model.addAttribute("cart",cart);
    }
}
