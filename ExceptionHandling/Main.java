package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        try (Scanner scan = new Scanner(System.in)) {
            //System.out.println(1 / 0);
            System.out.println("Enter a number : ");
            int num = scan.nextInt();
            System.out.println(num / 2);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by Zero!");
        }
        catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        }
        catch (Exception e) { // Handle all type of exceptions
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("This always executes.");
        }
    }
}
