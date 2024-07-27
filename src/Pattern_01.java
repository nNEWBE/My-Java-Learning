import java.util.Scanner;

public class Pattern_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = number; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
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