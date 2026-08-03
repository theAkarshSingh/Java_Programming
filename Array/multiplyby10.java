package Array;

//import java.util.Arrays;

public class multiplyby10 {

    static int[] prod(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] * 10;
            newArr[i] = arr[i];
        }
        return newArr;
    }

    static void main() {
        int[] arr = {10, 15, 20, 25, 30, 32, 38, 40};
        prod(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
//        System.out.println(Arrays.toString(prod(arr)));
    }
}
