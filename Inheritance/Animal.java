package Inheritance;

public abstract class Animal extends Organism {

    void eat() {
        System.out.println("This animal is eating.");
    }

    abstract void move();
}
