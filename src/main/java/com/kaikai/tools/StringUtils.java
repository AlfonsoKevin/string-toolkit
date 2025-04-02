package com.kaikai.tools;

/**
 * @description: 字符串工具类
 * @create: 2025-04-02 20:30
 * @author: TangZhiKai
 **/
public class StringUtils {
    private StringUtils(){}

    /**
     * 安全的空值处理
     * @param input 输入字符串
     * @return
     */
    public static String safeTrim(String input){
        return input == null ? "" : input;
    }

    /**
     * 下划线转换为驼峰式命名
     * @param underline 下划线式字符串
     * @return 驼峰式字符串
     */
    public static String convertHumpStyle(String underline){
        if(underline == null || underline.length() == 0) {
            return "";
        }
        String[] parts = underline.split("_");
        if(parts.length <= 1) {
            return parts[0];
        }
        StringBuilder stringBuilder = new StringBuilder(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            //取出首字母,大写
            String head = parts[i].substring(0, 1).toUpperCase();

            stringBuilder.append(head).append(parts[i].substring(1));
        }
        return stringBuilder.toString();
    }
}
