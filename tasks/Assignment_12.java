import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        int initial_number = input.nextInt();
        System.out.print("Enter final number : ");
        int final_number = input.nextInt();
        int count = 0;

        System.out.print("The armstrong numbers from " + initial_number + " to " + final_number + " are : ");

        for (int i = initial_number; i <= final_number; i++) {
            int rem = 0, cube = 0, temp = i;
            while (temp != 0) {
                rem = temp % 10;
                temp /= 10;
                cube += Math.pow(rem, 3);
            }
            if (i == cube) {
                System.out.print(cube + " ");
                count++;
            }
        }

        System.out.println("\nThere are " + count + " armstrong numbers.");

        input.close();
    }
}
