package OOP.Inheritance;

public class Cat extends Animal {
    int lives = 9;

    void speak() {
        System.out.println("The cat goes *meow*");
    }

    @Override
    void move() {
        System.out.println("This cat is running.");
    }
}
