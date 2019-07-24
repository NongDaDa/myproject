package com.project.shiro.Service;


import java.util.ArrayList;
import java.util.List;
import com.project.shiro.Entity.ShiroUser;
import org.springframework.stereotype.Service;

@Service
public class UserShiroService {

    // 用户的集合
    private List<ShiroUser> ShiroUsers = new ArrayList<>();

    public UserShiroService() {
        // 从数据库查出来的用户名，密码，这是是静态数据(密码是123456)
        ShiroUsers.add(new ShiroUser("admin", "038bdaf98f2037b31f1e75b5b4c9b26e"));
        ShiroUsers.add(new ShiroUser("ShiroUser", "098d2c478e9c11555ce2823231e02ec1"));
    }

    // 判断是否用户名是否存在
    public boolean selectUsername(String ShiroUsername) {
        for (ShiroUser ShiroUser : ShiroUsers) {
            if (ShiroUser.getUsername().equals(ShiroUsername)) {
                return true;
            }
        }
        return false;
    }

    // 根据用户返回查询的密码
    public String selectPassword(String ShiroUsername) {
        for (ShiroUser ShiroUser : ShiroUsers) {
            if (ShiroUser.getUsername().equals(ShiroUsername)) {
                return ShiroUser.getPassword();
            }
        }
        return "";

    }


}
