package Array;

import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] deep = Arrays.copyOf(arr, arr.length); //keeps original copy preserved
        deep[0] = 100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
        System.out.println();
        int[] x = arr;
        x[2] = 100;
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
