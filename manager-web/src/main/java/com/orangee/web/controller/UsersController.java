package com.orangee.web.controller;

import com.orangee.pojo.Users;
import com.orangee.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:guoyucheng
 * @Date:2020/5/20
 */

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){

        usersService.addUser(users);
        return "ok";

    }
}
