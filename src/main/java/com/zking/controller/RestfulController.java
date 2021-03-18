package com.zking.controller;

import com.zking.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/restful")
public class RestfulController {

    //保存post请求
    @PostMapping
    public void post(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        System.out.println("保存");
    }

    @PutMapping("/{uid}")
    public void put(@PathVariable("uid") Integer uid,@RequestBody UserInfo userInfo){
        System.out.println(uid);
        System.out.println(userInfo);
        System.out.println("修改");
    }

    @GetMapping("/{uid}")
    @ResponseBody
    public UserInfo get(@PathVariable("uid") Integer uid){
        System.out.println("根据id查询:"+uid);
        UserInfo userInfo=new UserInfo();
        userInfo.setUid(uid);
        userInfo.setUsername("周奕萱");
        userInfo.setAge(6);
        userInfo.setPhone("..............");
        return userInfo;
    }

    @DeleteMapping("/{uid}")
    public void delete(@PathVariable("uid") Integer id){
        System.out.println(id);
        System.out.println("删除");
    }

    /**
     * 使用MultipartFile类型接受上传的文件，参数的名称必须与input中的name属性的名称一致
     * @param file
     * @return
     */
//    @PostMapping("/upload")
//    public String getFile(MultipartFile file){
//        System.out.println(file.getOriginalFilename());
//        return file.getOriginalFilename();
//    }

    /**
     * 使用MultipartFile类型接受上传的文件，参数的名称必须与input中的name属性的名称一致
     * @param file
     * @return
     */
//    @PostMapping("/upload")
//    public String getFile(MultipartFile file, HttpServletRequest req) throws Exception{
//        //获取文件存储路径（绝对路径）
//        String path=req.getServletContext().getRealPath("/upload");
//        //获取原文件名
//        String fileName=file.getOriginalFilename();
//        //创建文件实例
//        File filePath=new File(path,fileName);
//        //入如果文件目录不存在，就创建目录
//        if(!filePath.getParentFile().exists()){
//            filePath.getParentFile().mkdirs();
//            System.out.println("创建目录:"+filePath);
//        }
//        //写入文件
//        file.transferTo(filePath);
//        return file.getOriginalFilename();
//    }
    
    @PostMapping("/manyUpload")
    public void getFiles(MultipartFile file[]){
        for (MultipartFile multipartFile : file) {
            System.out.println(multipartFile.getOriginalFilename());
        }
    }
}
