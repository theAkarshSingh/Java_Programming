package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    static void main() {

        try (FileWriter fileWriter = new FileWriter("FileHandling/Test.txt")) {
            fileWriter.write("I love Coding.");
            System.out.println("File has been written.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Couldn't locate the file.");
        }
        catch (IOException e) {
            System.out.println("Couldn't write file.");
        }
    }
}
