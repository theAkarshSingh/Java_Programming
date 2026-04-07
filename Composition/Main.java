package Composition;

//Composition => represents a part of relationship between objects
//Allows complex objects to be created from smaller objects

public class Main {
    static void main() {
        Car car = new Car("Mercedes AMG G63", 2025, "V8");
        System.out.printf("%s %d %s\n", car.model, car.year, car.engine.type);
        car.start();
    }
}
