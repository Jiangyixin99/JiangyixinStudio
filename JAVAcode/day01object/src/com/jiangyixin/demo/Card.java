package com.jiangyixin.demo;

//lombok可以为类自动添加getter和setter方法 无参构造器 @Data

public class Card {
    private String carId;
    private String name;
    private int phoneNum;
    private double balance;

    public Card() {
    }

    public Card(String carId, String name, int phoneNum, double balance) {
        this.carId = carId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.balance = balance;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 预存金额
    public void deposit(double money) {
        balance += money;
    }

    // 消费金额
    public void consume(double money) {
        if (balance < money) {
            System.out.println("余额不足");
        } else {
            balance -= money;
        }
    }

}
