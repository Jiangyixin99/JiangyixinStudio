package com.jiangyixin.demo;

public class SilverCard extends Card {
    public SilverCard() {
    }

    public SilverCard(String carId, String name, int phoneNum, double balance) {
        super(carId, name, phoneNum, balance);
    }

    @Override
    public void consume(double money) {
        if (getBalance() < money * 0.9) {
            System.out.println("余额不足");
        } else {
            setBalance(getBalance() - money * 0.9);
            System.out.println("消费" + (money * 0.9) + "元，余额为" + getBalance());
        }
    }
}
