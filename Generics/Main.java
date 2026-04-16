package Generics;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        Box<String> box1 = new Box<>();
        box1.setItem("banana");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(11);
        System.out.println(box2.getItem());

        Product<String, Double> product1 = new Product<>("Apple", 1.1);
        Product<String, Integer> product2 = new Product<>("Keyboard", 150);
    }
}
