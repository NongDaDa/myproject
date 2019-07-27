package com.project.rest.service.impl;

import com.project.rest.dao.UserRoleDao;
import com.project.rest.domain.UserRole;
import com.project.rest.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public void addRoleOnUser(UserRole userRole) {
        userRoleDao.addRoleOnUser(userRole);
    }

    @Override
    public void deleteRoleOnUser(String userId, String roleId) {
        userRoleDao.deleteRoleOnUser(userId,roleId);
    }

    @Override
    public List<UserRole> getAllRoleByUserId(String userId) {
        return userRoleDao.getAllRoleByUserId(userId);
    }
}
