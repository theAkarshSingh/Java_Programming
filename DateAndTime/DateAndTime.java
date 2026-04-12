package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    static void main() {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);
    }
}
