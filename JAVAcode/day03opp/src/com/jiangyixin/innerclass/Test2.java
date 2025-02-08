package com.jiangyixin.innerclass;

public class Test2 {
    public static void main(String[] args) {
        // 匿名内部类
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();

    }

}

// class Cat imp Animal {
// @Override
// public void cry() {
// System.out.println("喵喵喵");
// }
// }
