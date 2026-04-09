package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class foodList {
    static void main() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the no of food you would like : ");
        int numOfFood = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scan.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

        scan.close();
    }
}
