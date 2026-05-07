package CollectionFrameworks.ComparableInterface;

import CollectionFrameworks.ComparatorInterface.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(2);
        list.add(90);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Akarsh", 52));
        students.add(new Student(21, "Love", 87));
        students.add(new Student(22, "Ankit", 62));
        students.add(new Student(19, "Srishti", 51));

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight - o2.weight;
//            }
//        });

        Collections.sort(students, new WeightComparator());
        System.out.println(students);

        Collections.sort(students, ((o1, o2) -> o1.weight - o2.weight)); //lambda expression
    }
}
