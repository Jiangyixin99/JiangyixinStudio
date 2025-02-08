package com.jiangyixin.javabean;

//实体类 只负责数据存取 数据处理交给其他类完成
public class Student {
    private String name;
    private int age;
    private char sex;
    private int math;
    private int chinese;

    public Student(String name, int age, char sex, int math, int chinese) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.math = math;
        this.chinese = chinese;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getMath() {
        return math;
    }

    public int getChinese() {
        return chinese;
    }

    public Student() {
    }

}
