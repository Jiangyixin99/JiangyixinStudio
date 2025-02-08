package com.jiangyixin.object;

public class test02 {
public static void main(String[] args) {
    //创建对象
    //使用有参构造器
    constructor02 s1 = new constructor02("jiangyixin", 18, '男');
    s1.print();
    
    //创建一个对象 s2
    constructor02 s2 = new constructor02();
    s2.setAge(18);

}
}
