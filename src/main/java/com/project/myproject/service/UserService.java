package com.project.myproject.service;


import com.project.myproject.domain.User;

public interface UserService {
    User selectUserById(Integer userId);
    void addUser(User user);

}
