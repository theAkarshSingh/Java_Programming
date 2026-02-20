package Array;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(25);
        arr.add(21);
        arr.add(10);
        arr.add(11);
        System.out.println(arr.get(2));
        arr.set(3, 50);
        System.out.println(arr);
        arr.add(2, 88); // add element to specified index shifting other elements to right side
        int n = arr.size(); // length of arraylist
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        arr.remove(3);
        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
