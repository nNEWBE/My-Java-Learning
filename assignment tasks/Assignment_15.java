import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
            while (true) {
                System.out.print("Enter a day number (1-7) : ");
                int day_number = input.nextInt();
                if (day_number >= 1 && day_number <= 7) {
                    System.out.println(weekdays[day_number - 1]);
                    break;
                } else
                    System.out.println("Invalid day number!! Try again\n\n");
            }
        }
    }
}
