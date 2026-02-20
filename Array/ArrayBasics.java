package Array;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(x[4]);
        x[4] = 51;
        System.out.println(x[4]);
        System.out.println("Length of array is: " + x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // Input and Output in Array
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j : arr) //enhanced for - iterate over each element
            System.out.println(j);
    }
}
