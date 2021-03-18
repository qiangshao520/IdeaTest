package com.zking.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zking.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("hello Controller");
        return "hello";
    }

    @RequestMapping(value = "method1",method=RequestMethod.GET)
    public String method1(){
        return "forward:/WEB-INF/pages/hello.jsp";
    }

    @RequestMapping(value = "method2")
    public ModelAndView method2(){
        System.out.println("返回modelAndView对象...");
        ModelAndView mv=new ModelAndView();
        //转发的方式进行页面跳转
        mv.setViewName("hello");
        //设置视图的具体路径
        //mv.setViewName("forward:/WEB-INF/pages/hello.jsp");
        return mv;
    }

    @RequestMapping(value = "method3")
    public String method3(HttpServletRequest request){
        request.setAttribute("name","欢迎宝贝回家！");
        return "hello";
    }

    @RequestMapping(value = "method4")
    public ModelAndView method4(){
        //创建modelAndView对象
        ModelAndView mv=new ModelAndView();
        //设置视图
        mv.setViewName("hello");
        //设置视图中展示的数据
        mv.addObject("title","狗子,你妈叫你回家吃饭...");
        return mv;
    }

    @RequestMapping(value = "method5")
    public void method5(HttpServletResponse response) throws Exception{
        //设置响应头，防止中文乱码
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("只爱佳人相伴");
    }

    //使用produces设置相应内容类型，解决中文乱码问题
    @RequestMapping(value = "method6",produces = "text/html;charset=utf-8")
    //@ResponseBody的作用是表明当前方法的返回值会绑定响应头中，可以应用在方法上，可以应用在类上。
    @ResponseBody
    public String method6(){
        return "只恨相见之晚";
    }

    @RequestMapping(value = "method7")
    @ResponseBody
    public UserInfo method7(){
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername("周永强");
        userInfo.setAge(22);
        userInfo.setUid(1);
        userInfo.setPhone("15211638393");
        return  userInfo;
    }

    @RequestMapping(value = "method8")
    @ResponseBody
    public List<UserInfo> method8(){
        List<UserInfo> list=new ArrayList<UserInfo>();
        UserInfo u1=new UserInfo();
        u1.setUsername("周奕萱");
        u1.setAge(5);
        u1.setUid(2);
        u1.setPhone("............");

        UserInfo u2=new UserInfo();
        u2.setUsername("周凌飞");
        u2.setAge(3);
        u2.setUid(3);
        u2.setPhone("............");

        list.add(u1);
        list.add(u2);
        return list;
    }
}
