package com.jiangyixin.interfacedemo3;

//一般不会使用
public interface A {
    // 默认方法
    default void go() {
    }

    // 私有方法 只能在接口内部调用
    private void test() {
    }

    // 静态方法 只能用接口名调用
    static void test2() {
    }

}
