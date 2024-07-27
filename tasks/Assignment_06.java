import java.util.Scanner;

public class Assignment_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any option : ");
        int digit = input.nextInt();

        switch (digit) {
    
            case 1:
                System.out.println("Selected language is Bangali");
                break;
            case 2:
                System.out.println("Selected language is Hindi");
                break;
            case 3:
                System.out.println("Selected language is Urdu");
                break;
            case 4:
                System.out.println("Selected language is English");
                break;

            default:
                System.out.println("Not an option");
                break;
        }

        input.close();

    }
}
