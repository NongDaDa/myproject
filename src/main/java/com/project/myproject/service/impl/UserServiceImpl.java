package com.project.myproject.service.impl;

import com.project.myproject.domain.User;
import com.project.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.myproject.dao.UserDao;
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
}
