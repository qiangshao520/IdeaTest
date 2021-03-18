package com.zking.controller;

import com.zking.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;


/*
 *该注解是类级别的注解
 *应用之后相当于使用了@ResponseBody和@Controller两个注解，减少@ResponseBody的使用次数
 */
@RestController
public class TestController {

    @RequestMapping("/param")
    public String getParamByRequest(HttpServletRequest request){
        //通过servlet api获取request中的请求参数
        String username=request.getParameter("username");
        return username;
    }

    @RequestMapping("/param1")
    public String getParamByString(String username){
        System.out.println("spring完成参数绑定的值:"+username);
        return username;
    }

    //基本类型
    @RequestMapping("/param2")
    public UserInfo getParam(String username,Integer age){
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        userInfo.setAge(age);
        return userInfo;
    }

    //POJO类型
    /*
    @RequestMapping("/userParam")
    public UserInfo getUserParam(UserInfo userInfo){
        return userInfo;
    }
    */
    //数组类型
    @RequestMapping("/arrayParam")
    public void getArray(String[] array){
        System.out.println(Arrays.asList(array));
    }

    @RequestMapping("/paramName")
    public String getName(@RequestParam ("name") String name){
        return name;
    }

    @RequestMapping("/userParam")
    public UserInfo getUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return userInfo;
    }

    @RequestMapping("/listParam")
    public List<UserInfo> getUserInfo(@RequestBody List<UserInfo> list){
        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
        return list;
    }
}
