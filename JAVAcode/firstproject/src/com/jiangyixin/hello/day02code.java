package com.jiangyixin.hello;

import java.util.Scanner;


public class day02code {
    
public static void main(String[] args) {
  printUserInfo();
}
/**
 * 打印用户信息
 * 该方法通过控制台输入获取用户的姓名，并打印出来
 */
public static void printUserInfo() {
    // 创建Scanner对象以读取控制台输入
    Scanner sc = new Scanner(System.in);
    // 提示用户输入姓名
    System.out.println("请输入姓名：");
    // 读取用户输入的姓名
    String username = sc.next();
    // 打印用户姓名
    System.out.println("名字：" + username);
    // 关闭Scanner对象，释放资源
    sc.close();
}
public static void printVariable(int a) {
    if(a>10){
        System.out.println("正数");
    }else if(a<0){
        System.out.println("负数");
        
    }else{
        System.out.println("零");
    System.out.println(a);
}
}



}