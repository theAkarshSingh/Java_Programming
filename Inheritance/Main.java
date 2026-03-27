package Inheritance;

// Inheritance -> One class inherits the attributes and methods from another class.
// Child class <- Parent class <- Grandparent class

public class Main {
    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog Life Status : " + dog.isAlive);
        System.out.println("Cat Life status : " + cat.isAlive);

        System.out.println("Dog Lives : " + dog.lives);
        System.out.println("Cat Lives : " + cat.lives);

        dog.speak();
        dog.eat();
        cat.speak();
        cat.eat();

        Plants plant = new Plants();
        System.out.println(plant.isAlive);
        plant.photosynthesis();

        System.out.println();
        Person person = new Person("Akarsh", "Singh");
        person.showName();
        System.out.println();

        Student student = new Student("Akarsh", "Singh", 7.5);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Akarsh", " ", 50000);
        employee.showSalary();
    }
}
