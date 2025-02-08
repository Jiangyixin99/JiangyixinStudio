package com.jiangyixin.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 目标 掌握ArrayList的基本使用
        // 创建ArrayList对象 代表一个集合
        // 泛型为String所以集合中只能存字符串类型
        ArrayList<String> list = new ArrayList<>();
        // 添加元素

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println("一共有" + list.size() + "个数据");
            System.out.println(list);
            System.out.println("开始取第" + (i + 1) + "个数");
            System.out.println(list.get(i));
        }
        // 删除元素
        System.out.println("开始删除");
        list.remove(2);
        System.out.println(list);
        // 修改
        System.out.println("开始修改");
        list.set(1, "王五");
        System.out.println(list);

    }

}
