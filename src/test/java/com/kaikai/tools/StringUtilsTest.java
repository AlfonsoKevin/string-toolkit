package com.kaikai.tools;

import org.junit.Test;

import java.util.List;

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

    @Test
    public void testIsNumber(){
        String test1 = "hello_abd_acd_abde";
        String test2 = "h_";
        String test3 = "_1";
        String test4 = "_bb";
        String test5 = "1231241234";
        boolean a = StringUtils.isNumber(test1);
        boolean b = StringUtils.isNumber(test2);
        boolean c = StringUtils.isNumber(test3);
        boolean d = StringUtils.isNumber(test4);
        boolean e = StringUtils.isNumber(test5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }


    @Test
    public void testGetAllSubNumber(){
        List<Integer> result = StringUtils.getAllSubNumber("123");
        result.forEach(System.out::println);
    }

    @Test
    public void testMaskString(){
        String result = StringUtils.maskString("1233456", 0, 3);
        // String result1 = StringUtils.maskString("1233456", -1, 3);
        String result2 = StringUtils.maskString("1233456", 0, 2);
        String result3 = StringUtils.maskString("1233456", 0, 7);
        System.out.println(result);
        // System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
