package Array;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int d = 8;
        d %= n;
        rotateArray ra = new rotateArray();
        ra.reverse(arr, 0, d - 1);
        ra.reverse(arr, d, n - 1);
        ra.reverse(arr, 0, n - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
