package com.jiangyixin.javabean;

//业务处理 成绩的计算
public class StudentOperator {
    private Student student;
    private int num;

    public Student getStudent() {
        return student;
    }

    public int getNum() {
        return num;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // 定义一个有参构造器
    public StudentOperator(Student student) {
        this.student = student;
    }

    // 总成绩的算法
    public void printTotalScore() {
        System.out.println(student.getName() + "的总成绩是" + (student.getMath() + student.getChinese()));
    }

    // 平均成绩的算法
    public void printAvgScore() {
        System.out.println(student.getName() + "(的平均成绩是)" + (student.getMath() + student.getChinese()) / 2);
    }

}
