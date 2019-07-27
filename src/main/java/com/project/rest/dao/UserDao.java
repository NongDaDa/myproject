package com.project.rest.dao;

import com.project.rest.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public User selectUserById(Integer userId);
    public void addUser(User user);
    public  void updateUserById(User user);
    public void deleteUserById(int id);
    public User selectUserByUsername(String username);
    public List<User> selectAllUser();
}
