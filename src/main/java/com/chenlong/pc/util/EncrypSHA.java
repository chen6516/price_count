package com.chenlong.pc.util;
/**
 * 单向加密密码,不可逆.
 */
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  
  
public class EncrypSHA {  
      
    public static String eccrypt(String info) throws NoSuchAlgorithmException{  
        MessageDigest sha = MessageDigest.getInstance("SHA");  
        byte[] srcBytes = info.getBytes();  
        //使用srcBytes更新摘要  
        sha.update(srcBytes);  
        //完成哈希计算，得到result  
        byte[] resultBytes = sha.digest();  
        return new String (resultBytes);  
    }  
}  