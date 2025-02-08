package com.jiangyixin.movieproject;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovie() {
        for (Movie movie : movies) {
            System.out.println(movie.getId() + " " + movie.getName() + " " + movie.getPrice() + " " + movie.getActor());
        }
    }

    public void searchMovieById() {
        System.out.println("请输入电影id：");
        try (Scanner sc = new Scanner(System.in)) {
            int id = sc.nextInt();
            for (Movie movie : movies) {
                if (movie.getId() == id) {
                    System.out.println(
                            movie.getId() + " " + movie.getName() + " " + movie.getPrice() + " " + movie.getActor());
                    return;
                }

            }
            System.out.println("没有找到该电影");
        }
    }
}
