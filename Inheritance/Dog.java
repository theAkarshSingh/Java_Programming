package Inheritance;

public class Dog extends Animal {
    int lives = 1;

    void speak() {
        System.out.println("The dog goes *woof*");
    }

    void eat() {
        System.out.println("The Dog is eating.");
    }

    void move() {
        System.out.println("This dog is running.");
    }
}
