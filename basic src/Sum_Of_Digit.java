import java.util.Scanner;

public class Sum_Of_Digit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int digit = input.nextInt();
        int sum = 0, rem, temp = digit;

        while (temp != 0) {
            rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        System.out.println("The summation of each digit of " + digit + " is : " + sum);
        input.close();
    }

}
