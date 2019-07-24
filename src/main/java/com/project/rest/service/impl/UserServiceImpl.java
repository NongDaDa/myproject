package com.project.rest.service.impl;

import com.project.rest.domain.User;
import com.project.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.rest.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUserById(User user) {
        userDao.updateUserById(user);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }
}
