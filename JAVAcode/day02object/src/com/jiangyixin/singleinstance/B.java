package com.jiangyixin.singleinstance;

//设计成单例设计模式
//懒汉式单例设计模式
public class B {
    // 2 提供一个公共的静态方法
    private static B b;

    // 1 私有化构造器
    private B() {
    }

    // 3 提供一个公共的静态方法
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
