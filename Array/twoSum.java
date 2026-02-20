package Array;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
            }
        }
    }
}
