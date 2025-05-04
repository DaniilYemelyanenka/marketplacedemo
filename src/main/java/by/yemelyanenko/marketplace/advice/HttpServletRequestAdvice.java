package by.yemelyanenko.marketplace.advice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class HttpServletRequestAdvice {

    @ModelAttribute
    public void addGlobalAttributeRequest(Model model, HttpServletRequest httpServletRequest){
        model.addAttribute("currentPath", httpServletRequest.getRequestURI());
    }
}
