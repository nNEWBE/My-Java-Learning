import java.util.Scanner;

public class Decimal_To_Binary_Octal_Hexadecimal {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a decimal number : ");
            int decimal = input.nextInt();

            String binary = Integer.toBinaryString(decimal);
            System.out.println(binary);

            String octal = Integer.toOctalString(decimal);
            System.out.println(octal);

            String hexdecimal = Integer.toHexString(decimal);
            System.out.println(hexdecimal.toUpperCase());
        }
    }
}
