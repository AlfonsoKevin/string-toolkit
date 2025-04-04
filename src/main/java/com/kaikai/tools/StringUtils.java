package com.kaikai.tools;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 线程安全的转换 下划线转换为驼峰式命名
     * @param underline  下划线式字符串
     * @return 驼峰式字符串
     */
    public static String convertSafeHumpStyle(String underline){
        if(underline == null || underline.length() == 0) {
            return "";
        }
        String[] parts = underline.split("_");
        if(parts.length <= 1) {
            return parts[0];
        }
        StringBuffer stringBuffer = new StringBuffer(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            //取出首字母,大写
            String head = parts[i].substring(0, 1).toUpperCase();
            stringBuffer.append(head).append(parts[i].substring(1));
        }
        return stringBuffer.toString();
    }

    /**
     * 返回所有的不重复的子数串
     * @param number 原来的数字
     * @return
     */
    public static List<Integer> getAllSubNumber(String number){
        if(!isNumber(number)) {
            return new ArrayList<>();
        }
        int strLen = number.length();
        List<Integer> result = new ArrayList<>(1 << strLen);
        StringBuilder stringBuilder = new StringBuilder(number);

        for(int i = 0; i < strLen; i++){
            for(int j = i + 1;j <= strLen;j++){
                int num = Integer.parseInt(stringBuilder.substring(i,j));
                result.add(num);
            }
        }
        return result;
    }

    /**
     * 返回所有的不重复的子数串
     * @param number 原来的数字
     * @return
     */
    public static List<Integer> getAllSubNumber(int number){
        return getAllSubNumber(String.valueOf(number));
    }

    /**
     * 判断字符串序列是否是一个数字序列
     * @param str
     * @return 如果是返回true，否则返回false
     */
    public static boolean isNumber(String str){
        for(int i =0 ;i <str.length();i++){
            char c = str.charAt(i);
            if(c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符串掩码处理（如：132****4567）
     * @param str 原始字符串
     * @param start 起始
     * @param length 长度
     * @return 掩码字符串
     */
    public static String maskString(String str,int start,int length){
        if(start < 0 || length > str.length()){
            throw new StringIndexOutOfBoundsException("Modify index out of bounds");
        }
        StringBuilder mask = new StringBuilder();
        for(int i =0 ;i < length ;i ++) {
            mask.append("*");
        }

        StringBuilder stBuilder = new StringBuilder(str);
        return new StringBuilder(stBuilder.substring(0, start)).append(mask.toString())
                .append(stBuilder.substring(start + length)).toString();
    }
}
