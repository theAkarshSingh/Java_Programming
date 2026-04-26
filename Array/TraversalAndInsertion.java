package Array;

import java.util.Scanner;

public class TraversalAndInsertion {
    static void traverseArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void insertInArray(int[] arr, int size, int x) {
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
    }
    static void insertAtBeginning(int[] arr, int x){
        int count = 0;
        for (int num : arr) {
            if (num != 0) {
                count++;
            }
        }
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }

    static void main() {
        int[] arr = new int[10];
        int size = 5;
        for (int i = 0; i < size; i++) {
            arr[i] = i * 10 * 2;
        }
        System.out.println("Array before Insertion : ");
        traverseArray(arr, size);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Element to be inserted : ");
        int x = scan.nextInt();
        insertInArray(arr, size, x);
        insertAtBeginning(arr, x);
        System.out.println("Array after Insertion : ");
        traverseArray(arr, size + 1);
    }
}
