package com.project.rest.controller;

import com.project.rest.domain.UserRole;
import com.project.rest.service.UserRoleService;
import com.project.rest.util.RtnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("/addRoleOnUser")
    public RtnFormat addRoleOnUser(@RequestBody UserRole userRole) {
        userRoleService.addRoleOnUser(userRole);
        return RtnFormat.success();
    }

    @DeleteMapping("/deleteRoleOnUser")
    public RtnFormat deleteRoleOnUser(String userId, String roleId) {
        userRoleService.deleteRoleOnUser(userId, roleId);
        return RtnFormat.success();
    }

    @GetMapping("/getAllRoleByUserId")
    public RtnFormat getAllRoleByUserId(String userId) {
        return RtnFormat.success(userRoleService.getAllRoleByUserId(userId));
    }


}
