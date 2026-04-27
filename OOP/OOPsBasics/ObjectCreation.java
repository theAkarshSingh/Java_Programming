package OOP.OOPsBasics;

// Object is an entity that holds data(attributes) and can perform actions
// Object is a reference data type
public class ObjectCreation {
    static void main() {
        Car car = new Car();
        car.start();
        car.drive();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

    }
}
