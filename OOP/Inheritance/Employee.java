package OOP.Inheritance;

public class Employee extends Person {
    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.firstName + "'s salary is $" + this.salary);
    }
}
