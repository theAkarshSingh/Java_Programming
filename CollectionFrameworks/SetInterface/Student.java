package CollectionFrameworks.SetInterface;

import java.util.HashSet;
import java.util.Objects;

public class Student {
    public int rollNo;
    public String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    static void main() {
        HashSet<Student> set = new HashSet<>();
        Student student1 = new Student(1, "Akarsh");
        Student student2 = new Student(1, "Akarsh");
        Student student3 = new Student(2, "Akarsh");

        set.add(student1);
        set.add(student2);
        set.add(student3);

        System.out.println(set);
    }
}
