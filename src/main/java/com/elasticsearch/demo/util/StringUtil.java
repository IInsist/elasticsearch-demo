package com.elasticsearch.demo.util;

import java.util.UUID;

/**
 * 字符串工具类
 */
public class StringUtil {

    /**
     * 生成UUID
     * @return
     */
    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args) {
        System.out.println(StringUtil.getUuid());
        System.out.println(StringUtil.getUuid());
        System.out.println(StringUtil.getUuid());
        System.out.println(StringUtil.getUuid());
    }

}
