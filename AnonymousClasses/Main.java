package AnonymousClasses;

public class Main {
    static void main() {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby says *ruh roh*");
            }
        };
        dog1.speak();
        dog2.speak();
    }
}
