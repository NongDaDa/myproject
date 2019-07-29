package com.project.rest.service.impl;

import com.project.rest.dao.ShiroRoleDao;
import com.project.rest.domain.ShiroRole;
import com.project.rest.service.ShiroRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiroRoleServiceImpl implements ShiroRoleService {
    @Autowired
    private ShiroRoleDao shiroRoleDao;

    @Override
    public List<ShiroRole> getAllRole() {
        return shiroRoleDao.getAllRole();
    }

    @Override
    public void addRole(ShiroRole shiroRole) {
        shiroRoleDao.addRole(shiroRole);
    }

    @Override
    public void deleteRoleById(String id) {
        shiroRoleDao.deleteRoleById(id);
    }

    @Override
    public void deleteRoleByRoleName(String roleName) {
        shiroRoleDao.deleteRoleByRoleName(roleName);
    }

    @Override
    public ShiroRole getRoleById(String id) {
        return shiroRoleDao.getRoleById(id);
    }
}
