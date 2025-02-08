package com.jiangyixin.interfacedemo2;

public class ClassDataInterImpl2 implements ClassDataInter {
    private Student[] Students;

    public ClassDataInterImpl2(Student[] Students) {
        this.Students = Students;
    }

    // 打印所有学生信息并包含男女人数信息
    @Override
    public void printallStudentsInfos() {
        int boy = 0;
        for (Student Student : Students) {
            if (Student.getSex() == '男') {
                boy++;
            }
            System.out.println(Student.getName() + " " + Student.getSex() + " " + Student.getScore());
            System.out.println("男生人数" + boy + "女生人数" + (Students.length - boy));
        }
    }

    // 打印所有人的平均分并去掉最高和最低分
    @Override
    public void printAvgScore() {
        double max = Students[0].getScore();
        double min = Students[0].getScore();
        for (Student Student : Students) {
            if (Student.getScore() > max) {
                max = Student.getScore();
            }
            if (Student.getScore() < min) {
                min = Student.getScore();
            }
        }

        double sum = 0;
        for (Student Student : Students) {
            sum += Student.getScore();
        }
        sum -= max;
        sum -= min;
        System.out.println("平均分(printAvgScore)" + sum / Students.length);
    }

}
