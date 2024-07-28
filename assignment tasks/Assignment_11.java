import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        int initial_number = input.nextInt();
        System.out.print("Enter final number : ");
        int final_number = input.nextInt();
        int count = 0;

        System.out.print("The palindrome numbers from " + initial_number + " to " + final_number + " are : ");

        for (int i = initial_number; i <= final_number; i++) {
            int rem = 0, sum = 0, temp = i;
            while (temp != 0) {
                rem = temp % 10;
                temp /= 10;
                sum = sum * 10 + rem;
            }
            if (i == sum) {
                System.out.print(sum + " ");
                count++;
            }
        }

        System.out.println("\nThere are " + count + " palindrome numbers.");

        input.close();
    }
}
