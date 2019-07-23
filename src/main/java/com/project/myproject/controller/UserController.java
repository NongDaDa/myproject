package com.project.myproject.controller;

import com.project.myproject.domain.User;
import com.project.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("getUserById")
    public User getUserById(@RequestParam(name = "id") int id){
        return  userService.selectUserById(id);
    }
}
