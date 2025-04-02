package com.kaikai.tools;

import org.junit.Test;

/**
 * @description: 测试类
 * @create: 2025-04-02 20:36
 * @author: TangZhiKai
 **/

public class StringUtilsTest {

    @Test
    public void testConvertHumpStyle(){
        String test1 = "hello_abd_acd_abde";
        String test2 = "h_";
        String test3 = "_1";
        String test4 = "_bb";
        String result1 = StringUtils.convertHumpStyle(test1);
        String result2 = StringUtils.convertHumpStyle(test2);
        String result3 = StringUtils.convertHumpStyle(test3);
        String result4 = StringUtils.convertHumpStyle(test4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
