package com.project.rest.service;

import com.project.rest.domain.UserRole;

import java.util.List;

public interface UserRoleService {
    /**
     * 给用户添加角色
     */
    public void addRoleOnUser(UserRole userRole);
    public void deleteRoleOnUser(String userId,String roleId);
    public List<UserRole> getAllRoleByUserId(String userId);
}
