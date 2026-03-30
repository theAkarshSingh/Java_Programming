package Inheritance;

public class Person {
    String firstName;
    String lastName;

    Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    void showName() {
        System.out.println("Full name : " + this.firstName + " " + this.lastName);
    }

    static void main() {
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
