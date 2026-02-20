package Array;

import java.util.Scanner;

public class ProdOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in Array :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int prod = 1;
        for (int i = 0; i < n; i++)
            prod *= arr[i];

        System.out.println("Product of Elements : " + prod);
    }
}
