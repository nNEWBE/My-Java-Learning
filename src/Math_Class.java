import java.util.Scanner;

public class Math_Class {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        Double first = input.nextDouble();
        System.out.print("Enter second number : ");
        Double second = input.nextDouble();

        System.out.println("Maximum number : " + Math.max(first, second));
        System.out.println("Minimum number : " + Math.min(first, second));
        System.out.println("Round number : " + Math.round(second));
        System.out.println("Absolute number : " + Math.abs(second));
        System.out.println("Floor number : " + Math.floor(first));
        System.out.println("Celi number : " + Math.ceil(first));
        System.out.println("Signum number : " + Math.signum(first));
        System.out.println("Power " + second + " of number " + first + " is : " + Math.pow(first, second));
        System.out.println("Square root of number " + second + " is : " + Math.sqrt(second));
        System.out.println("Cube root of number " + first + " is : " + Math.cbrt(first));
        System.out
                .println("Square root of (" + first + "^2 + " + second + "^2)" + " is : " + Math.hypot(first, second));
        System.out.println("Random number : " + Math.random());
        System.out.println("The value of PI is : " + Math.PI);

        input.close();
    }

}
