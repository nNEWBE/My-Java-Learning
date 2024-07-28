import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double)num1 / num2; //* used type casting to convert into double type from int type 
        int mod = num1 % num2;

        System.out.printf("Sum = %d\nSub = %d\nMul = %d\nDiv = %.2f\nMod = %d\n", sum, sub, mul, div,mod);

        input.close();
    }
}
