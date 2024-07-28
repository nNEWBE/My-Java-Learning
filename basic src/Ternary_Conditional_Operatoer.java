import java.util.Scanner;

public class Ternary_Conditional_Operatoer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number_1 = input.nextInt();
        System.out.print("Enter second number : ");
        int number_2 = input.nextInt();

        int large = (number_1 > number_2)? number_1 : number_2;
        System.out.println("The largest number is " + large);
        input.close();
    }

}
