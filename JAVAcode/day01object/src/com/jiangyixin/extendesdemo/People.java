package com.jiangyixin.extendesdemo;

//父类
public class People {
    private String name;
    private char sex;

    // 封装
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    // 构造器
    public People() {
    }

    public People(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

}
