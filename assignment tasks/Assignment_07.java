import java.util.Scanner;

public class Assignment_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The summation of " + 1 + " to " + number + " is " + sum);
        input.close();
    }

}
