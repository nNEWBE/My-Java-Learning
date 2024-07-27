import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == j || i + j == number + 1 || j == number || j == 1 || i == 1 || i == number)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        input.close();
    }
}
