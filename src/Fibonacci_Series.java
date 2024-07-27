import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int first = 0, second = 1, fibo;

        if (number <= 0) {
            System.out.print("Fibonacci series : None ");
        } else if (number == 1) {
            System.out.print("Fibonacci series : " + first);
        } else if (number == 2) {
            System.out.print("Fibonacci series : " + first + " " + second + " ");
        } else {
            System.out.print("Fibonacci series : " + first + " " + second + " ");
            for (int i = 2; i < number; i++) {
                fibo = first + second;
                first = second;
                second = fibo;
                System.out.print(fibo + " ");

            }
        }
        input.close();
    }

}
