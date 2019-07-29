package com.project.rest.controller;

import com.project.rest.domain.ShiroPermission;
import com.project.rest.service.ShiroPermissionService;
import com.project.rest.util.RtnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permission")
public class ShiroPermissionController {
    @Autowired
    private ShiroPermissionService shiroPermissionService;

    @GetMapping("/getAllPermission")
    public RtnFormat getAllPermission() {
        return RtnFormat.success(shiroPermissionService.getAllPermission());
    }

    @GetMapping("/getPermissionById")
    public RtnFormat getPermissionById(String id) {
        return RtnFormat.success(shiroPermissionService.getPermissionById(id));
    }

    @DeleteMapping("/deletePermissionById")
    public RtnFormat deletePermisionById(String id) {
        shiroPermissionService.deletePermissionById(id);
        return RtnFormat.success();
    }

    @DeleteMapping("/deletePermissionOnUser")
    public RtnFormat deletePermissionOnUser(String id,String  permission){
        shiroPermissionService.deletePermissionOnUser(id,permission);
        return RtnFormat.success();
    }

    @PostMapping("/addPermission")
    public  RtnFormat addPermission(@RequestBody ShiroPermission shiroPermission){
        shiroPermissionService.addPermission(shiroPermission);
        return RtnFormat.success();
    }

    @GetMapping("/getPermissionByUserId")
    public RtnFormat getPermissionByUserId(String userId){
        return RtnFormat.success(shiroPermissionService.getPermissionByUserId(userId));
    }


}
