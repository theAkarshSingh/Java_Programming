package Methods;

import java.util.Scanner;

// BEGINNER LEVEL BANKING PROGRAM
public class banking {
    static Scanner scan = new Scanner(System.in);

    static void main() {
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("\n***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************\n");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT\n");
            System.out.println("***************");
            System.out.print("Enter your choice(1-4) : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }
        System.out.println("***************************");
        System.out.println("Thank You! Have a Nice Day.");
        System.out.println("***************************");
        scan.close();
    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an Amount to be deposited : ");
        amount = scan.nextDouble();
        if (amount > 0) {
            return amount;
        } else {
            System.out.println("Negative Amount can't be deposited.");
            return 0;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter Amount to be withdrawn : ");
        amount = scan.nextDouble();
        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be Negative.");
            return 0;
        } else
            return amount;
    }
}
