package com.jiangyixin.interfacedemo;

public interface interface1 {
    // JDK8之前 接口中只能有常量和抽象方法

    // 接口中可以省略public static final 默认会加
    String SCHOOL_NAME = "jiangyixin";

    // 接口中可以省略public abstract 默认会加
    void method1();
}
