package com.jiangyixin.hello;

public class day01code {
public static void main(String[] args) {
       
   //调用printVariable()方法
   printVariable(1); 
   printVariable(1, 2);
   printVariable();
}
// 写一个方法
public static void printVariable(int a) {
    
    System.out.println(a);
}
public static void printVariable(int x, int y){
    System.out.println("x+y="+(x+y));

}
//强制转换 
public static void printVariable(){
    int a = 10;
    byte b = (byte) a;
    System.out.println(b);
}

}
