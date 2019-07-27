package com.project.rest.service.impl;

import com.project.rest.domain.User;
import com.project.rest.service.UserService;
import com.project.shiro.utils.EncodeAlgorithmUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.rest.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

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
        //实现密码加密
        user.setUserPassword(EncodeAlgorithmUtil.shiroMd5Encode(user));
        userDao.addUser(user);
    }

    @Override
    public void updateUserById(User user) {
        //实现密码加密
        user.setUserPassword(EncodeAlgorithmUtil.shiroMd5Encode(user));
        userDao.updateUserById(user);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public User selectUserByUsername(String username) {
       return userDao.selectUserByUsername(username);
    }

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();

    }
}

