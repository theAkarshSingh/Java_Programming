package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10,20,50,40,100,80};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        print(arr);
    }
    static void print(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
