package com.jiangyixin.hello;

import java.util.Scanner;

public class day05code {
public static void main(String[] args) {
	inputScore();
}
//一个数组
public static void nums() {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    //数组长度
    System.out.println(nums.length);
    
}
public static void inputScore() {
    //动态初始化数组
    double[] scores = new double[5];
    try (Scanner sc = new Scanner(System.in)){
    //创建数组
    for (int i = 0; i < scores.length; i++) {
        System.out.println("请输入第"+(i+1)+"个学生成绩");
        scores[i] = sc.nextDouble();
    }
    //求出最大最小值 平均值 
    double max = scores[0];
    double min = scores[0];
    double sum = 0;
    for (int i = 0; i < scores.length; i++){
        if (scores[i] > max ){
            max = scores[i];
        }
        if (scores[i] < min ){
            min = scores[i];
        }
        sum += scores[i];
    }
    double avg = sum / scores.length;
    System.out.println("平均值为" + avg);
    System.out.println("最大值为" + max);
    System.out.println("最小值为" + min);
    
}
}
}
