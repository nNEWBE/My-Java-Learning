import java.util.Scanner;

public class Prime_Numbers_Using_Funtion {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter initial number : ");
            int initial_number = input.nextInt();
            System.out.print("Enter final number : ");
            int final_number = input.nextInt();

            for (int i = initial_number; i <= final_number; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}