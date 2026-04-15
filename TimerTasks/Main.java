package TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 500, 1000);
    }
}
