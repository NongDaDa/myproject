package com.project.rest.dao;

import com.project.rest.domain.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleDao {
    public void addRoleOnUser(UserRole userRole);
    public void deleteRoleOnUser(String userId,String roleId);
    public List<UserRole> getAllRoleByUserId(String userId);
}
