import java.util.Scanner;

public class Prime_Numbers_In_Range {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter initial number : ");
            int initial_number = input.nextInt();

            System.out.print("Enter final number : ");
            int final_number = input.nextInt();

            int count = 0;
            int prime_count = 0;
            int total = 0;
            System.out.print("\nThe prime numbers from " + initial_number + " to " + final_number + " are : ");

            for (int i = initial_number; i <= final_number; i++) {

                if (i <= 1) {
                    continue;

                } else {
                    prime_count++;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            count++;
                            break;
                        }
                    }

                    if (count == 0) {
                        total++;
                        System.out.print(i + " ");
                    }
                    count = 0;

                }
            }

            if (prime_count == 0)
                System.err.println("None found");
            System.out.println("\nThere are " + total + " prime numbers.\n");

        }
    }
}