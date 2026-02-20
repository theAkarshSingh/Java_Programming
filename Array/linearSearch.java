package Array;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,9,64,88};
        int target = 9;
        int pos = 0;
        boolean flag = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                flag = true; // target element found
                pos = i;
                break;
            }
        }
        if (flag)
            System.out.println("Target found at index : " + pos);
        else
            System.out.println("Target does not found.");
    }
}
