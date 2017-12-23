package com.smart.luobo.controller;

import com.smart.luobo.entity.IdeaUser;
import com.smart.luobo.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Resource
    private IndexService indexService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "indexController:" + indexService.sayHello("luobo");
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public String queryAllUser(){
        return "allUser:"+indexService.queryAllUser().toString();
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(){
        IdeaUser ideaUser = new IdeaUser();
        ideaUser.setEmail("luobo@qq.com");
        ideaUser.setPassword("123456");
        ideaUser.setName("luobo");
        indexService.insertUser(ideaUser);
        return "insert user success";
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUserBySerilno(){
        IdeaUser ideaUser = new IdeaUser();
        ideaUser.setId(1);
        ideaUser.setPassword("abcd_123");
        indexService.updateUserBySerilno(ideaUser);
        return "update user success";
    }

}

