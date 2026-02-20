package Array;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 2, 1, 0, 1};
        int numof0s = 0, numof1s = 0, numof2s = 0;
        for (int j : arr) {
            if (j == 0)
                numof0s += 1;
            else if (j == 1)
                numof1s += 1;
            else if (j == 2)
                numof2s += 1;
        }
        for (int i = 0; i < numof0s; i++) {
            arr[i] = 0;
        }
        for (int i = numof0s; i < numof0s + numof1s; i++) {
            arr[i] = 1;
        }
        for (int i = numof0s + numof1s; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
