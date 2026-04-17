package Enums;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day of the week : ");
        String response = scan.nextLine().toUpperCase();

        try {

            Day day = Day.valueOf(response);
            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday.");
                case SATURDAY, SUNDAY -> System.out.println("It's the weekend.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day.");
        }
        scan.close();
    }
}
