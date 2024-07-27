import java.util.Scanner;

public class Assignment_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        long factorial = 1;
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            input.close();
            return;
        } else if (number == 0 || number == 1) {
            System.out.println("The factorial of " + number + " is " + factorial);
            input.close();
            return;
        }
        for (long i = number; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        input.close();
    }

}
