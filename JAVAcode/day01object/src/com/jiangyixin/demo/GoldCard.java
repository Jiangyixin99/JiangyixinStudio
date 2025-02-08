package com.jiangyixin.demo;

//金卡打八折 单次消费满200送一张洗车票
public class GoldCard extends Card {
    private int ticket;

    public GoldCard() {
    }

    public GoldCard(String carId, String name, int phoneNum, double balance) {
        super(carId, name, phoneNum, balance);
    }

    @Override
    public void consume(double money) {
        if (getBalance() < money * 0.8) {
            System.out.println(" 余额不足 请充值");
            return;
        } else {
            setBalance(getBalance() - money * 0.8);
            System.out.println("金卡打八折消费" + (money * 0.8) + "元，余额为" + getBalance());
        }
        if (money * 0.8 >= 200) {
            System.out.println("消费满200送一张洗车票");
            printTicket();
        }
    }

    public void printTicket() {
        ticket++;
        System.out.println("打印一张洗车票 洗车票剩余" + ticket + "张");

    }
}