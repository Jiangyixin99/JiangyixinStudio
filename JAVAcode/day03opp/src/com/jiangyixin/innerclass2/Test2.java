package com.jiangyixin.innerclass2;

import java.util.Arrays;

public class Test2 {
    // 目标 完成给数组排序 理解匿名内部类的用法

    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 99, '男');
        students[1] = new Student("李四", 19, 98, '男');
        students[2] = new Student("王五", 20, 97, '男');
        students[3] = new Student("赵六", 21, 96, '男');
        students[4] = new Student("田七", 22, 95, '男');
        students[5] = new Student("王八", 23, 94, '男');

        // 排序按年龄升序
        // 1
        // Arrays.sort(students, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // return o1.getAge() - o2.getAge();
        // }
        // });
        // 2
        // Arrays.sort(students, (Student o1, Student o2) -> {
        // return o1.getAge() - o2.getAge();
        // });
        // 3
        Arrays.sort(students, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        // 遍历

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
