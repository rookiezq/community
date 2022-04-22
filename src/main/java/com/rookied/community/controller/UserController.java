package com.rookied.community.controller;

import com.rookied.community.dao.UserMapper;
import com.rookied.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rookied
 * @date 2022.04.21
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(int id){
        return userMapper.selectById(id);
    }

}
