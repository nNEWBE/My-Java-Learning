import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        int initial_number = input.nextInt();
        System.out.print("Enter final number : ");
        int final_number = input.nextInt();
        for (int i = initial_number; i <= final_number; i++) {
            System.out.println("\nThe multiplication table of " + i + " is : ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
        System.out.println();
        input.close();
    }

}
