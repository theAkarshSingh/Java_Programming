package OOP.Inheritance;

public class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);
        //super -> refers to the parent class(subclass <- superclass)
        //used in constructors and method overriding
        //calls the parent constructor to initialize attributes
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.firstName + "'s GPA is " + this.gpa);
    }
}
