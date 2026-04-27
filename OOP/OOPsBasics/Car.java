package OOP.OOPsBasics;

public class Car {
    String brand = "Ford";
    String model = "Mustang";
    int year = 2025;
    boolean isRunning = false;

    static void main() {
    }

    void start() {
        System.out.println("You started the Engine.");
        isRunning = true;
    }

    void drive() {
        System.out.printf("You're driving the %s %s %d\n", brand, model, year);
    }

    void stop() {
        System.out.println("You stopped the Engine.");
        isRunning = false;
    }
}
