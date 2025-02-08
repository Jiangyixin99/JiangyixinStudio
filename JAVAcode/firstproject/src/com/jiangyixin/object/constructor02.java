package com.jiangyixin.object;

public class constructor02 {
    //3.1隐藏 使用private关键字 私有修饰成员变量 就只能在本类中直接访问
    //成员变量
    private String name;
    private int age;
    private char sex;
    //1.构造器
    //1.1无参构造器
    public constructor02(){

    }
    //1.2有参构造器
    public constructor02(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //2.this应用
    //打印一句话print
    public void print(){
        System.out.println("属性" + this.name + this.age + this.sex);

    }
    //3.2合理暴露
    
    public void setAge(int age){
        if(age > 0 && age < 120)
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
