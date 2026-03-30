package Inheritance;

// Inheritance -> One class inherits the attributes and methods from another class.
// Child class <- Parent class <- Grandparent class

public class Main {
    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        System.out.println("Dog Life Status : " + dog.isAlive);
        System.out.println("Cat Life status : " + cat.isAlive);

        System.out.println("Dog Lives : " + dog.lives);
        System.out.println("Cat Lives : " + cat.lives);

        System.out.println();
        dog.speak();
        dog.eat();
        dog.move();
        System.out.println();
        cat.speak();
        cat.eat();
        cat.move();
        System.out.println();
        fish.move();

        Plants plant = new Plants();
        System.out.println("\nPlant life status : " + plant.isAlive);
        plant.photosynthesis();
        System.out.println();

    }
}
