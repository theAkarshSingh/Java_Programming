package Inheritance;

public class Cat extends Animal {
    int lives = 9;

    void speak() {
        System.out.println("The cat goes *meow*");
    }

    void eat() {
        System.out.println("The Cat is eating.");
    }

    void move() {
        System.out.println("This cat is running.");
    }
}
