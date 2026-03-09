package Array;

import java.util.Scanner;

public class QuizGame {
    static void main() {
        String[] questions = {"What is Java? ",
                "Which part of computer is considered as the brain?",
                "In which year ChatGPT launched?",
                "Which output device is used to display results on screen?",
                "Which was the first programming language?"};
        String[][] options = {{"1. Processor", "2. Programming language", "3. Keyboard layout", "4. Data Structure"},
                {"1. CPU", "2. Hard Drive", "3. GPU", "4. RAM"},
                {"1. 2021", "2. 2022", "3. 2023", "4. 2024"},
                {"1. Keyboard", "2. Monitor", "3. Mouse", "4. Speaker"},
                {"1. COBOL", "2. C Programming language", "3. FORTRAN", "4. Assembly"}};
        int[] answers = {2, 1, 2, 2, 3};
        int score = 0;
        int guess;
        Scanner scan = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game.");
        System.out.println("******************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess : ");
            guess = scan.nextInt();
            if (guess == answers[i]) {
                System.out.println("CORRECT!");
                score++;
            } else
                System.out.println("WRONG!");
        }
        System.out.println("Your Final Score is " + score + " out of " + questions.length);
        scan.close();
    }
}
