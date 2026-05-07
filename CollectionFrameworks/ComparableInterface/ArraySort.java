package CollectionFrameworks.ComparableInterface;

import java.util.Arrays;

public class ArraySort {
    static void main() {
        Integer[] arr = {5, 1, 7, 2, 8, 4};
        Arrays.sort(arr, new ReverseComparator());
        System.out.println(Arrays.toString(arr));
    }
}
