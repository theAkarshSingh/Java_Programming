package TimerTasks;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDown {
    static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of seconds to countdown from : ");
        int input = scan.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = input;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("HAPPYY BIRTHDAYYY");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);

        scan.close();
    }
}
