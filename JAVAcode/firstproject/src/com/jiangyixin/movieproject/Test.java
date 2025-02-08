package com.jiangyixin.movieproject;

import com.jiangyixin.javabean.VerifyCode;

public class Test {

    public static void main(String[] args) {

        Movie[] movies = new Movie[6];

        // 初始化电影数组
        movies[0] = new Movie(1, "速度与激情7", 9.5, "范·迪塞尔");
        movies[1] = new Movie(2, "功夫瑜伽", 9.0, "周星驰");
        movies[2] = new Movie(3, "阿甘正传", 9.8, "zhaoyun");
        movies[3] = new Movie(4, "霸王别姬", 9.5, "张国荣");
        movies[4] = new Movie(5, "肖申克的救赎", 9.5, "罗宾斯");
        movies[5] = new Movie(6, "速度与激情7", 9.5, "范·迪塞尔");

        // 创建一个操作对象
        MovieOperator movieMethod = new MovieOperator(movies);
        movieMethod.printAllMovie();
        movieMethod.searchMovieById();
        System.out.println(VerifyCode.getcode(4));
    }

}
