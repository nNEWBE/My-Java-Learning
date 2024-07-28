import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] args) {

        // ? Bitwise AND => &  
        // # Bitwise OR => |  
        // @ Bitwise XOR => ^  
        // ! Bitwise NOT => ~  
        // do Bitwise Shift Right => >>  
        // * Bitwise Shift Left => <<  

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number_1 = input.nextInt();
        System.out.print("Enter second number : ");
        int number_2 = input.nextInt();
        System.out.println("number_1 & number_2 : " + (number_1 & number_2));
        System.out.println("number_1 | number_2 : " + (number_1 | number_2));
        System.out.println("number_1 ^ number_2 : " + (number_1 ^ number_2));
        System.out.println("number_1>>3 : " + (number_1 >> 3));
        System.out.println("number_2<<3 : " + (number_2 << 3));
        System.out.println("~ number_2 : " + (~number_2));
        input.close();

    }
}
