package Array;

public class indexingOddEven {
    public static void main(String[] args) {
        int[] arr = {11, 24, 38, 48, 58};
        printArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                arr[i] *= 2;
            else
                arr[i] += 10;
        }
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println();
    }
}
