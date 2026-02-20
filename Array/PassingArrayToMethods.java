package Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {1,5,3,8,11};
        System.out.println("Original Array : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("\nAfter Changing: ");
        change(x); //
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    static void change(int[] y) {
        y[4] = 20;
    }
}
