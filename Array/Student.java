package Array;

public class Student {
    String name;
    int rollno;

    void display() {
        System.out.println("Name : " + name + "\t" + "Roll No : " + rollno);
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(); // Array of Objects
        students[0].name = "Akarsh";
        students[0].rollno = 123345;
        students[0].display();

        students[1] = new Student();
        students[1].name = "Unknown";
        students[1].rollno = 12389;
        System.out.println(students[1].name);
        System.out.println(students[1].rollno);
    }
}
