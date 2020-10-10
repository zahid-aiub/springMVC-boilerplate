package com.zahid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {

    public static final String USER_SESSION_KEY = "username";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession(false);
        if(session!=null && session.getAttribute(USER_SESSION_KEY)!=null){
            try{
                response.sendRedirect("/dashboard");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            HttpServletResponse response,
            ModelMap modelMap) throws IOException {

        if(username.equalsIgnoreCase("zahid") && password.equalsIgnoreCase("zahid")) {
            session.setAttribute("username", username);
            try{
                response.sendRedirect("/dashboard");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else {
            modelMap.put("error", "Invalid Account");
            response.sendRedirect("/login");
        }
    }
}
