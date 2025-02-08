package com.jiangyixin.interfacedemo;

public class Test {
    public static void main(String[] args) {
        // 认识接口 清除接口特点 用途
        // 接口的特点：
        // 1.接口是一种引用数据类型
        // 2.接口是完全抽象的
        // 3.接口只能由常量和抽象方法组成
        // 4.接口支持多继承
        // 5.接口支持多态
        // 6.接口没有无参构造方法
        // 7.接口是支持类多实现的
    }
}

interface demo {
    public static final String SCHOOL_NAME = "jiangyixin";

    public abstract void method1();
}

class demo1 implements demo {
    @Override
    public void method1() {
        System.out.println("method1");
    }
}