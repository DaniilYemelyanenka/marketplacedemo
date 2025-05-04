package by.yemelyanenko.marketplace.advice;

import by.yemelyanenko.marketplace.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class DELETEAFTERADDSECURITY {

    @ModelAttribute
    public void addUserGlobal(Model model){
        model.addAttribute("user",new User("Ivan", "12345678","USER"));
    }
}
