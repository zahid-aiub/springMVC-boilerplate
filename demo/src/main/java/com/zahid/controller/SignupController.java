package com.zahid.controller;

import com.zahid.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class SignupController {
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupIndex(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") @Valid User user, BindingResult result){
//        SignupValidator signupValidator = new SignupValidator();
//        signupValidator.validate(user,result);
        if(result.hasErrors()){
            return "signup";
        }
        return "index";
    }
}
