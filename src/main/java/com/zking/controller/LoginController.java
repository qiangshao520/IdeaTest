package com.zking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class LoginController {

    @RequestMapping("/login")
    public String login(String user, String password, HttpServletRequest request){
        HttpSession session=request.getSession();
        if(user!=null){
            session.setAttribute("user",user);
        }
        return "success";
    }
}
