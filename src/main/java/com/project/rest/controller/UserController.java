package com.project.rest.controller;

import com.project.rest.domain.User;
import com.project.rest.service.UserService;
import com.project.rest.util.RtnFormat;
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

    @PutMapping("updateUserById")
    public RtnFormat updateUserById(@RequestBody User user){
        userService.updateUserById(user);
        return RtnFormat.success();
    }

    @DeleteMapping("deleteUserById")
    public RtnFormat deleteUserById(@RequestParam(name = "id") int id){
        userService.deleteUserById(id);
        return RtnFormat.success();
    }
}
