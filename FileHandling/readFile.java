package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    static void main() {

        String filePath="FileHandling/Test.txt";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line=reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File found.");
        }
        catch (IOException e) {
            System.out.println("Could not locate file.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
