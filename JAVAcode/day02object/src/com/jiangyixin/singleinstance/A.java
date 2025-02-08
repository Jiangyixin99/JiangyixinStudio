package com.jiangyixin.singleinstance;

//设计成单例设计模式
//饿汉式单例设计模式
public class A {
    // 2 提供一个公共的静态方法
    private static final A a = new A();

    // 1 私有化构造器 : 确保单例类不能对外创建太多对象
    private A() {
    }

    // 3 提供一个公共的静态方法
    public static A getInstance() {
        return a;
    }
}
