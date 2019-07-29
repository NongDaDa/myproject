package com.project.rest.dao;

import com.project.rest.domain.ShiroRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShiroRoleDao {
    public List<ShiroRole> getAllRole();
    public void addRole(ShiroRole shiroRole);
    public void deleteRoleById(String id);
    public void deleteRoleByRoleName(String roleName);
    public  ShiroRole getRoleById(String id);
}
