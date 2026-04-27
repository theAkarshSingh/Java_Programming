package OOP.OOPsBasics;

public class StudentMain {
    static void main() {
        Student student1 = new Student("Akarsh Singh", 20, 8.2);
        Student student2 = new Student("Divyanshi Singh", 20, 8.8);
        System.out.printf("Name : %s  Age:%d  GPA:%.2f\n", student1.name, student1.age, student1.gpa);
        System.out.printf("Name : %s  Age:%d  GPA:%.2f\n", student2.name, student2.age, student2.gpa);
        student1.study();
        student2.study();
    }
}
