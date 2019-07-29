package com.project.rest.service;

import com.project.rest.domain.ShiroRole;

import java.util.List;

public interface ShiroRoleService {
    public List<ShiroRole> getAllRole();
    public void addRole(ShiroRole shiroRole);
    public void deleteRoleById(String id);
    public void deleteRoleByRoleName(String roleName);
    public  ShiroRole getRoleById(String id);
}
