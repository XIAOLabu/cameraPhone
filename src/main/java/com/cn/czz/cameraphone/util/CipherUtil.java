package com.cn.czz.cameraphone.util;

import java.security.MessageDigest;
import java.util.Random;

/**
 * MD5转换
 *
 * @ClassName getMD5
 * @Description TODO
 * @Author Czz
 * @Date 2023/7/3 18:44
 * @Version 1.0
 **/
public class CipherUtil {

    // 十六进制下数字到字符得映射数组
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};


    /**
     * 加密
     *
     * @param account 盐（账户或email）
     * @param pwd     密码
     * @return
     */
    public static String generatePasswd(String account) {
        Random random = new Random();
        String pwd = String.valueOf(random.nextInt(10));
        return encodeByMD5("[" + account.toUpperCase() + "=" + pwd + "]");
    }

    /* 对字符串进行加密 */
    public static String encodeByMD5(String pwd) {
        if (pwd != null) {
            try {
                // 创建具有指定算法名称得信息摘要
                MessageDigest md = MessageDigest.getInstance("MD5");
                // 使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
                byte[] results = md.digest(pwd.getBytes());
                // 将得到的字节数组变成字符串返回
                return byteArrayToHexString(results).toUpperCase();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 转换字节数组为十六进制字符串
     *
     * @param 字节数组
     * @return 十六进制字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /**
     * 将一个字节转化成十六进制形式的字符串
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static void main(String[] args) {
        for (int i = 0 ; i<=100 ; i++){
            System.out.println(generatePasswd("199686"));
        }
    }
}
