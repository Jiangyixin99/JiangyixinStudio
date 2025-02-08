package com.jiangyixin.interfacedemo2;

public class Test1 {
    public static void main(String[] args) {
        // 完成接口小案例
        // 定义学生类 创建学生对象 封装学生数据
        // 准备学生数据 造学生数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 90);
        allStudents[1] = new Student("李四", '男', 80);
        allStudents[2] = new Student("王五", '男', 70);
        allStudents[3] = new Student("赵六", '男', 60);
        allStudents[4] = new Student("钱七", '男', 50);
        allStudents[5] = new Student("孙八", '男', 40);
        allStudents[6] = new Student("周九", '男', 30);
        allStudents[7] = new Student("吴十", '男', 20);
        allStudents[8] = new Student("郑十一", '男', 10);
        allStudents[9] = new Student("冯十二", '男', 0);

        // 提供两套业务实现方案 支持灵活切换
        // 方案1 打印所有学生信息 打印所有学生的平均分
        // 方案2 打印所有学生信息并包含男女人数信息 打印所有人的平均分并去掉最高和最低分
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);

        cdi.printallStudentsInfos();
        cdi.printAvgScore();

    }
}
