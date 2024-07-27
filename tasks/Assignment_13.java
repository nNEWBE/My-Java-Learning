import java.util.Scanner;

public class Assignment_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Shuvo";
        int password = 1234;
        boolean condition = true;

        while (condition) {
            System.out.print("Enter your name : ");
            String entered_name = input.nextLine();
            System.out.print("Enter your password : ");
            int entered_password = input.nextInt();
            input.nextLine();
            condition = !entered_name.equals(name) || entered_password != password;
            System.out.println("Username/Password is incorrect. Please try again.");
            System.out.println();
        }

        System.out.println("Welcome, " + name);
        input.close();
    }

}
