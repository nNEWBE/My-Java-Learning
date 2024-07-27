import java.util.Scanner;

public class Palindrom_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int rem, temp = number, sum = 0;

        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            sum = sum * 10 + rem;
        }

        if(number==sum)
        System.out.println("The number " + number + " is a palindrome number.");
        else System.out.println("The number " + number + " is not a palindrome number.");
        input.close();
    }
}
