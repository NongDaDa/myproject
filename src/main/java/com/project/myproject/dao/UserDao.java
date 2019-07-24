package com.project.myproject.dao;

import com.project.myproject.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User selectUserById(Integer userId);
    public void addUser(User user);
}
