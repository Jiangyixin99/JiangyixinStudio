package com.jiangyixin.interfacedemo2;

public class ClassDataInterImpl1 implements ClassDataInter {
    private Student[] Students;

    public ClassDataInterImpl1(Student[] Students) {
        this.Students = Students;
    }

    // 打印所有学生信息
    @Override
    public void printallStudentsInfos() {

        for (Student Student : Students) {
            System.out.println(Student.getName() + " " + Student.getSex() + " " + Student.getScore());
        }
    }

    // 打印所有学生的平均分
    @Override
    public void printAvgScore() {
        int sum = 0;
        for (Student Student : Students) {
            sum += Student.getScore();

        }
        System.out.println("平均分(printAvgScore):" + sum / Students.length);
    }
}
