import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int rem, temp = number, cube = 0;

        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            cube += Math.pow(rem, 3);
        }

        if (number == cube)
            System.out.println("The number " + number + " is an armstrong number.");
        else
            System.out.println("The number " + number + " is not an armstrong number.");
        input.close();
    }
}
