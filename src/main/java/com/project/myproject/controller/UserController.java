package com.project.myproject.controller;

import com.project.myproject.domain.User;
import com.project.myproject.service.UserService;
import com.project.myproject.util.RtnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUserById")
    public RtnFormat getUserById(@RequestParam(name = "id") int id) {
        return  RtnFormat.success(userService.selectUserById(id));
    }

    @PostMapping("addUser")
    public RtnFormat addUser(@RequestBody User user){
        userService.addUser(user);
        return RtnFormat.success();
    }
}
