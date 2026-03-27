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
}
