package com.project.rest.dao;

import com.project.rest.domain.ShiroPermission;
import com.project.rest.domain.ShiroRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShiroPermissionDao {
    public List<ShiroPermission> getAllPermission();
    public void addPermission(ShiroPermission shiroPermission);
    public void deletePermissionById(String id);
    public void deletePermissionOnUser(String userId,String permission);
    public  ShiroPermission getPermissionById(String id);
    public List<ShiroPermission> getPermissionByUserId(String userId);
}
