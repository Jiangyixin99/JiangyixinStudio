package com.jiangyixin.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Tortoise();
        animal1.run();
        System.out.println(animal1.name);
        Animal animal2 = new Wolf();
        animal2.run();
        System.out.println(animal2.name);
    }
}
