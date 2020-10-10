package com.zahid.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DashboardController {

    @RequestMapping(value = "/dashboard")
    public ModelAndView dashboard(){
        System.out.println("************************");
        ModelAndView modelAndView = new ModelAndView("dashboard");
        return modelAndView;
    }


}
