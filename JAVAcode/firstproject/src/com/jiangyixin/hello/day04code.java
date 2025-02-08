package com.jiangyixin.hello;

public class day04code {
public static void main(String[] args) {
    num(100, 200);
}
//生成n-m之间的数字 
public static void num(int n, int m) {
int primeCount = 0;
    for (int i = n; i <= m; i++){
        if (isPrime(i)){
            System.out.println(i + "是素数");
            primeCount ++;
        }
    }
    System.err.println("素数共有" + primeCount + "个");
}
//判断是否是素数
public static boolean isPrime(int num) {
     if (num <= 1){
        return false;
    }
    if (num == 2) {
        return true;
    }
    if (num % 2 == 0) {
    return false;
    }
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
        if (num % i == 0) {
        return false;
        }
    }

    return true;
}
}