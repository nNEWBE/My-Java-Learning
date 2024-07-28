import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Current_Date_Class {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(date));

        LocalDate local_date = LocalDate.now();
        System.out.println(local_date);
    }
}
