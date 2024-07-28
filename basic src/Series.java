import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last number : ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += Math.pow(i, 2); //* 1^2 + 2^2 + 3^2 + 4^2 + 5^2 + ... +number^2 
        }
        System.out.println("The summation is " + sum);
        input.close();
    }

}
