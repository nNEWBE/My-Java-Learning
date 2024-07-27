import java.util.Scanner;

public class Pattern_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int j = i; j <= number - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        input.close();
    }

}
