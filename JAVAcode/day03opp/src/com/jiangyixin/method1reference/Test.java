package com.jiangyixin.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    // 目标 方法引用
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 99, '男');
        students[1] = new Student("李四", 19, 98, '男');
        students[2] = new Student("王五", 20, 97, '男');
        students[3] = new Student("赵六", 21, 96, '男');
        students[4] = new Student("田七", 22, 95, '男');
        students[5] = new Student("王八", 23, 94, '男');
        String[] strings = { "a", "b", "c", "d", "e", "f" };
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        // 引用了类中的方法
        Arrays.sort(students, (o1, o2) -> Student.compareByAge(o1, o2));
        // 静态方法引用 类名::静态方法名
        Arrays.sort(students, Student::compareByAge);

        // 成员(实例)方法引用 对象::方法名
        // 匿名内部类
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareByHeight(o2);
            }
        });
        Arrays.sort(students, (o1, o2) -> o1.compareByHeight(o2));
        Student t = new Student();
        Arrays.sort(students, t::compareByHeight);

        // 特定类的任意对象的方法引用 类名::方法名
        // 匿名内部类
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });
        // lambda表达式
        Arrays.sort(strings, (o1, o2) -> o1.compareTo(o2));
        // 特定类型方法引用
        Arrays.sort(strings, String::compareTo);
    }
}
