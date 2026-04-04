package GettersAndSetters;

public class Main {
    static void main() {
        Car car = new Car("Defender", "White", 100000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        car.setColor("Black");
        car.setPrice(110000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        car.setColor("Silver Grey");
        car.setPrice(111000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
