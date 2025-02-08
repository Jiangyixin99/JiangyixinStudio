package com.jiangyixin.polymorphism;

public class Animal {
    String name = "animal";

    public void run() {
        System.out.println("Animal is running");
    }
}

class Wolf extends Animal {
    String name = "wolf";

    @Override
    public void run() {
        System.out.println("Wolf is running");
    }
}

class Tortoise extends Animal {
    String name = "tortoise";

    @Override
    public void run() {
        System.out.println("Tortoise is running slowly");
    }
}