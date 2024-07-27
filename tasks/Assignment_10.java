import java.util.Scanner;

public class Assignment_10 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            int first = 0, second = 1, fibo=0;

            if (number <= 0) {
                System.out.print("There is no number");
            } else if (number == 1) {
                System.out.print("The " + number + "th fibonacci number is : " + first);
            } else if (number == 2) {
                System.out.print("The " + number + "th fibonacci number is : " + second);
            } else {
                for (int i = 2; i < number; i++) {
                    fibo = first + second;
                    first = second;
                    second = fibo;
                }
                System.out.print("The " + number + "th fibonacci number is : " + fibo);
            }
            input.close();
        }

}
