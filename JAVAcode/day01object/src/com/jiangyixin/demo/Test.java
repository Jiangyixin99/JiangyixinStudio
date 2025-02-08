package com.jiangyixin.demo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // 加油站支付
        // 1 创建卡片类
        // 2 定义一个父卡
        // 3 定义一个金卡类
        // 4 定义一个银卡类
        // 5 办一张金卡 创建金卡对象 交给一个独立业务处理
        Card Goldcard = new GoldCard("赣66666", "江一欣", 19039131, 5000);
        Card Silvercard = new SilverCard("粤88888", "江二欣", 12313, 2000);
        pay(Goldcard);
        pay(Silvercard);
    }

    public static void pay(Card card) {
        System.out.println("请输入消费金额");
        try (Scanner sc = new Scanner(System.in)) {
            double money = sc.nextDouble();
            card.consume(money);
        }
    }
}