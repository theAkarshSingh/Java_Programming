package Methods;

import java.util.Scanner;

public class methodsDemo {
    static void sum(int a, int b) { // method without return type but with arguments
        int sum = a + b;
        System.out.println("Sum of " + a + " & " + b + " is : " + sum);
    }

    static int addition() { // method with return type & without parameters
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        sum = a + b;
        return sum;
    }

    static double average(int a, int b) {
        double avg = (double) addition() / 2; // calling one method inside another method
        return avg;
    }

    static int product(int a, int b) { //with return type and arguments
        return a * b;
    }

    static void findSquareRoot(int num) {
        if (num < 0)
            return;
        System.out.println("Square root is : " + Math.sqrt(num));
    }

    public static void main(String[] args) {
        System.out.println("The sum is : " + addition());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("The product is : " + product(a, b));
        System.out.println("The Average two num is : " + average(a, b));
        sum(a, b);
        findSquareRoot(a);
    }
}
