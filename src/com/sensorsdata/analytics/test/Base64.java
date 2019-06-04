package com.sensorsdata.analytics.test;


import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

import java.io.IOException;


/**
 * @author lhy
 * base64 编码转换
 */
public class Base64 {

    public static void main(String[] args) {

        String value1 = "password";
        System.out.println("原数据："+ value1);

        String value2 = encryptBASE64(value1);
        System.out.println("加密后数据："+ value2);

        String value3 = decryptBASE64(value2);
        System.out.println("解密后数据："+ value3);

    }

    public static String decryptBASE64(String key){
        byte [] bt;
        try {
              bt = (new BASE64Decoder()).decodeBuffer(key);
              return new String(bt);

        } catch (IOException e){
              e.printStackTrace();
              return "";
        }
    }

    public static String encryptBASE64(String key){
        byte [] bt = key.getBytes();
        return (new BASE64Encoder()).encodeBuffer(bt);
    }




}
