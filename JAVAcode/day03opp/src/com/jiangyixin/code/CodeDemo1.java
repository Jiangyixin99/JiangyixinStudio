package com.jiangyixin.code;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];
    // 静态代码块 与类一起加载 自动执行一次
    // 基本作用 可以完成对类的静态资源的初始化
    static {
        System.out.println("静态代码块");
        schoolName = "北京大学";
        cards[0] = "大王";
        cards[1] = "小王";
        cards[2] = "♥A";
        // ...

    }
    // 属于对象
    {
        System.out.println("构造代码块 也叫实例代码块 与构造方法一起执行  每次创建对象都会执行");

    }

    public static void main(String[] args) {

        System.out.println("main方法执行了");
    }
}
