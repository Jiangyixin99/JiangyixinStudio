package com.jiangyixin.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        // 目标 封装字符串
        // 1.直接赋值
        String s1 = "abc";
        System.out.println(s1);
        // 2.构造方法
        String s2 = new String();
        System.out.println(s2);
        byte[] bytes = { 97, 98, 99 };
        String s3 = new String(bytes);
        System.out.println(s3);
        char[] chars = { 'a', 'b', 'c' };
        String s4 = new String(chars);
        System.out.println(s4);
        // 3.常用方法
        // 获取字符串的长度
        int length = s4.length();
        System.out.println(length);

    }
}
