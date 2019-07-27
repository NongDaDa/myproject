package com.project.rest.controller;

import com.project.rest.domain.ShiroRole;
import com.project.rest.service.ShiroRoleService;
import com.project.rest.util.RtnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class ShiroRoleController {
    @Autowired
    private ShiroRoleService shiroRoleService;

    @GetMapping("/getAllRole")
    public RtnFormat getAllRole(){
        return RtnFormat.success(shiroRoleService.getAllRole());
    }

    @PostMapping("/addRole")
    public RtnFormat addRole(@RequestBody ShiroRole shiroRole){
        shiroRoleService.addRole(shiroRole);
        return RtnFormat.success();
    }

    @DeleteMapping("/deleteRoleById")
    public RtnFormat deleteRoleById(String id){
        shiroRoleService.deleteRoleById(id);
        return RtnFormat.success();
    }

    @DeleteMapping("/deleteRoleByRoleName")
    public RtnFormat deleteRoleByRoleName(String roleName){
        shiroRoleService.deleteRoleByRoleName(roleName);
        return RtnFormat.success();
    }
}
