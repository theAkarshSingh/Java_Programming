package Abstraction;

public class Main {
    static void main() {
        Circle circle=new Circle(5);
        Triangle triangle=new Triangle(3,4);
        Rectangle rectangle=new Rectangle(5,4);

        circle.display();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
