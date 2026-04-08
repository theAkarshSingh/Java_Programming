package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(11);
        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pomegranate");
        fruits.add("mango");
        System.out.println(fruits);
        //fruits.remove(1);
        fruits.set(1, "orange");
        System.out.println(fruits);
        System.out.println("No of fruits : " + fruits.size());
        Collections.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
