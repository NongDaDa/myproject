package com.project.test;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Test {
    public static void main(String[] args) {
        System.out.println("encode:" + MD5Encode("123456"));
        System.out.println("md5:"+shiroMd5Encode("user","123456"));
    }


    public static String MD5Encode(String password) {
        String algrithm = "MD5";
        char[] encodeHex = null;
        byte[] digest = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algrithm);
            messageDigest.update(password.getBytes());
            digest = messageDigest.digest();
            //encodeHex = Hex.encode(digest);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String md5code = new BigInteger(1, digest).toString(16);// 16进制数字
        // 如果生成数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }

        return md5code;

    }


    public static String shiroMd5Encode(String userName, String password) {
        ByteSource credentialsSalt01 = ByteSource.Util.bytes(userName);
        String hashAlgorithmName = "MD5";//加密方式
        //1024指的是加密的次数
        Object simpleHash = new SimpleHash(hashAlgorithmName, password,
                credentialsSalt01, 1024);

        return simpleHash.toString();
    }

    //我要merge

}
