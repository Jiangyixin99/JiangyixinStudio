package com.jiangyixin.innerclass2;

public class Student {

    public static void compareByAge(Student o1, Student o2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex=" + sex +
                '}';
    }

}
