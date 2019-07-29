package com.project.rest.service;

import com.project.rest.domain.ShiroPermission;

import java.util.List;

public interface ShiroPermissionService {
    public List<ShiroPermission> getAllPermission();
    public void addPermission(ShiroPermission shiroPermission);
    public void deletePermissionById(String id);
    public void deletePermissionOnUser(String userId,String permission);
    public  ShiroPermission getPermissionById(String id);
    public List<ShiroPermission> getPermissionByUserId(String userId);
}
