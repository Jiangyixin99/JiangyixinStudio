package com.jiangyixin.singleinstance;

public class Test {
    public static void main(String[] args) {
        // 3 调用公共的静态方法
        A a1 = A.getInstance();
        A a2 = A.getInstance();
    }
}
