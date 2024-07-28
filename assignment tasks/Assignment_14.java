import java.util.Scanner;

public class Assignment_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
        input.close();
    }

}
