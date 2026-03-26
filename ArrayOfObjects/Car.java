package ArrayOfObjects;

public class Car {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive " + this.color + " " + this.model);
    }

    static void main() {
        Car[] cars = {new Car("Mercedes AMG G63", "Black"),
                new Car("Defender", "White"),
                new Car("Mustang", "Red")};

        for (Car car : cars) {
            car.drive();
        }
    }
}
