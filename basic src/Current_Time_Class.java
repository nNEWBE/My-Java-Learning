import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_Time_Class {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current.getHour() + ":" + current.getMinute() + ":" + current.getSecond());

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(formatter.format(time));

        System.out.println();

        DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE hh:mm:ss");

        String formattedDateTime = current.format(formatter_2);
        System.out.println("Formatted date and time: " + formattedDateTime);

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter_3 = DateTimeFormatter.ISO_DATE;

        String formattedDate = date.format(formatter_3);
        System.out.println("Formatted date: " + formattedDate);
    }
}