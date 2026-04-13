package MiniProjects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    static void main() {

        String filePath = "MiniProjects\\SummerSmile.wav";
        File file = new File(filePath);

        try (Scanner scan = new Scanner(System.in);
             AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.print("Enter your choice : ");
                response = scan.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        } catch (IOException e) {
            System.out.println("Something went wrong:(");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        } finally {
            System.out.println("BYE!");
        }
    }
}
