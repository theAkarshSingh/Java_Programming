package Inheritance;

public class Car {
    String brand;
    String model;
    int year;
    String color;

    Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        // toString() -> Method inherited from object class,by default it returns a hash code as unique identifier
        // But it can be overridden to provide meaningful details
        return this.color + " " + this.brand + " " + this.model + " " + this.year;
    }

    static void main() {
        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        System.out.println(car1);
        Car car2 = new Car("Mercedes", "Maybach GLS 600", 2025, "Black");
        System.out.println(car2);
    }
}
