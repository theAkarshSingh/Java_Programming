package Array;

public class segregate0and1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        int numof0s = 0, numof1s = 0;
        for (int j : arr) {
            if (j == 0)
                numof0s += 1;
            if (j == 1)
                numof1s += 1;
        }
        for (int i = 0; i < numof0s; i++) {
            arr[i] = 0;
        }
        for (int i = numof0s; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
