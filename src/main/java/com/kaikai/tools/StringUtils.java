package com.kaikai.tools;

/**
 * @description: 字符串工具类
 * @create: 2025-04-02 20:30
 * @author: TangZhiKai
 **/
public class StringUtils {
    private StringUtils(){}

    /**
     * 字符串的安全处理
     * @param input
     * @return
     */
    public static String safeTrim(String input){
        return input == null ? "" : input;
    }

}
