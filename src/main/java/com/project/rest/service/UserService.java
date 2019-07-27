package com.project.rest.service;


import com.project.rest.domain.User;

import java.util.List;

public interface UserService {
    User selectUserById(Integer userId);
    void addUser(User user);
    void updateUserById(User user);
    void deleteUserById(int id);
    User selectUserByUsername(String username);
    List<User> selectAllUser();


}
