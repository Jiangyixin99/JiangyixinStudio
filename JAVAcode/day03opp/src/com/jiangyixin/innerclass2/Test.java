package com.jiangyixin.innerclass2;

public class Test {
    // 匿名内部类
    public static void main(String[] args) {
        // eg
        strat(new Swim() {
            @Override
            public void swim() {
                System.out.println("eg");
            }
        });

        strat(() -> {
            System.out.println("学生游得慢");
        });
        strat(() -> {
            System.out.println("老师游得快");
        });
    }

    public static void strat(Swim s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }

    public interface Swim {
        void swim();
    }
}
