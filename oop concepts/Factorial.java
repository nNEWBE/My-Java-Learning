import java.util.Scanner;

public class Factorial {
    int fact(int value) {
        if (value == 0 || value == 1)
            return 1;
        else
            return value * fact(value - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            System.out.println("The factorial of " + number + " is  : " + factorial.fact(number));
        }

    }
}
