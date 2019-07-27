package com.project.shiro.utils;

import com.project.rest.domain.User;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class EncodeAlgorithmUtil {
    private final static String hashAlgorithmName = "MD5";//加密方式

    /**
     * 加密算法
     *  盐值是用户名
     * @param user
     * @return
     */
    public static String shiroMd5Encode(User user) {
        ByteSource credentialsSalt01 = null;
        if (user.getUserName() == null) {
            credentialsSalt01 = ByteSource.Util.bytes("");
        } else {
            credentialsSalt01 = ByteSource.Util.bytes(user.getUserName());
        }

        //1024指的是加密的次数
        Object simpleHash = new SimpleHash(hashAlgorithmName, user.getUserPassword(),
                credentialsSalt01, 1024);
        return simpleHash.toString();
    }

    public static String shiroMd5Encode(String username, String password) {
        ByteSource credentialsSalt01 = ByteSource.Util.bytes(username);
        //1024指的是加密的次数
        Object simpleHash = new SimpleHash(hashAlgorithmName, password,
                credentialsSalt01, 1024);
        return simpleHash.toString();
    }

}
