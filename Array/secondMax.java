package Array;

import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0], smax = Integer.MIN_VALUE;
        System.out.println("Enter Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }
        System.out.println("Max : " + max);
        System.out.println("Second Max : " + smax);
    }
}
