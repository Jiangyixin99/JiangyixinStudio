package com.jiangyixin.method1reference;

public class Student {
    // 姓名 年龄 身高 性别
    private String name;
    private int age;
    private double height;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, double height, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex=" + sex +
                '}';
    }

    // 静态方法
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();

    }

    // 实例方法
    public int compareByHeight(Student o1) {
        return Double.compare(this.getHeight(), o1.getHeight());
    }

    public int compareByHeight(Student o1, Student o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
