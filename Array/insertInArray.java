package Array;

import java.util.Scanner;

public class insertInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter Element you want to insert : ");
        int element = scan.nextInt();
        System.out.print("Enter INDEX at which you want to store entered element in an Array : ");
        int index = scan.nextInt();
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
