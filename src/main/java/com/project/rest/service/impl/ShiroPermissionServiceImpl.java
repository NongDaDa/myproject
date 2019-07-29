package com.project.rest.service.impl;

import com.project.rest.dao.ShiroPermissionDao;
import com.project.rest.domain.ShiroPermission;
import com.project.rest.service.ShiroPermissionService;
import com.project.rest.util.RtnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiroPermissionServiceImpl implements ShiroPermissionService {

    @Autowired
    private ShiroPermissionDao shiroPermissionDao;

    @Override
    public List<ShiroPermission> getAllPermission() {
        return shiroPermissionDao.getAllPermission();
    }

    @Override
    public void addPermission(ShiroPermission shiroPermission) {
        shiroPermissionDao.addPermission(shiroPermission);
    }

    @Override
    public void deletePermissionById(String id) {
        shiroPermissionDao.deletePermissionById(id);
    }

    @Override
    public void deletePermissionOnUser(String userId,String permission) {
        shiroPermissionDao.deletePermissionOnUser(userId,permission);
    }

    @Override
    public ShiroPermission getPermissionById(String id) {
        return shiroPermissionDao.getPermissionById(id);
    }

    @Override
    public List<ShiroPermission> getPermissionByUserId(String userId) {
        return shiroPermissionDao.getPermissionByUserId(userId);
    }
}
