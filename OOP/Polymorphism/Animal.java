package OOP.Polymorphism;

import java.util.Scanner;

public abstract class Animal {
    abstract void speak();

    static void main() {
        Scanner scan = new Scanner(System.in);
        Animal animal;
        System.out.println("Would you like cat or dog? (1=dog, 2=cat): ");
        int choice = scan.nextInt();
        if (choice == 1) {
            animal = new Dog(); // Runtime OOP.Polymorphism
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}
