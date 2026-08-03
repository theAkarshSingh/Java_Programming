package Array;

public class Average {
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) { //O(n)
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static void main() {
        int[] arr = {2, 5, 4, 6};
        System.out.println("Average: "+ getAverage(arr));
    }
}
