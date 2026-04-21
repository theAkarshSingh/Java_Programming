package MiniProjects.AlarmClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scan;

    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scan) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scan = scan;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(100);
                LocalTime currentTime = LocalTime.now();
                System.out.printf("Current Time : \r%02d:%02d:%02d \n", currentTime.getHour(),
                        currentTime.getMinute(), currentTime.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println("\n*ALARM NOISES*");
        Toolkit.getDefaultToolkit().beep();
    }

    private void playAudio(String filePath) {
        File audioFile = new File(filePath);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press <ENTER> to stop the alarm");
            scan.nextLine();
            clip.stop();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio unavailable");
        }
        catch (IOException e) {
            System.out.println("Error reading Audio File");
        }
    }
}
