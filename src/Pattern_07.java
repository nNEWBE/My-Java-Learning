import java.util.Scanner;

public class Pattern_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = number-1; i >= 1; i--) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

// // More ways to show patterns

// ! System.out.print(i + " ");
// * System.out.print("* ");
// do System.out.print("# ");
// # System.out.print((i%2) + " ");
// @ System.out.print((j%2) + " ");
// ? System.out.print((char)(i+64) + " ");
// ! System.out.print((char)(j+64) + " ");
// * System.out.print((char)(i+96) + " ");
// do System.out.print((char)(j+96) + " ");
