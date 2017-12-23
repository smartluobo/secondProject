package com.smart.luobo.controller.idea;

import com.smart.luobo.entity.IdeaUser;
import com.smart.luobo.service.idea.IdeaUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/idea")
public class IdeaUserController {

    @Resource
    private IdeaUserService ideaUserService;

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteByPrimaryKey(@PathVariable("id") Integer id) {
        //Integer id = 1;
        ideaUserService.deleteByPrimaryKey(id);
        return "delete ideauser success";
    }

    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    public String insertIdeaUser(@RequestBody IdeaUser ideaUser) {
        //IdeaUser record = new IdeaUser("luobo", "123456", "luobo@qq.com", "guangdong-shenzhen");
        ideaUserService.insertIdeaUser(ideaUser);
        return "insert ideauser success";
    }

    @RequestMapping(value = "/query/{id}",method = RequestMethod.GET)
    public String selectByPrimaryKey(@PathVariable("id") Integer id) {
        //Integer id = 1;
        IdeaUser ideaUser = ideaUserService.selectByPrimaryKey(id);
        if (ideaUser != null) {
            return ideaUser.toString();
        }
        return "ideauser is null";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateByPrimaryKeySelective(IdeaUser ideaUser) {
       // IdeaUser record = new IdeaUser("luobo1", "abcd_123", "luobo1@qq.com", "guangdong-shenzhen");
        ideaUserService.updateByPrimaryKeySelective(ideaUser);
        return "update ideauser success";
    }
}
