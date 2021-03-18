package com.zking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/inter")
public class InterceptorController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        System.out.println("test....");
        request.setAttribute("value","死亡如风");
        return "success";
    }
}
