import java.util.Scanner;

public class Assigemnt_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = input.nextDouble();
        System.out.print("Enter the value of y : ");
        double y = input.nextDouble();

        System.out.println("x+=y : "+(int)(x+=y));
        System.out.println("x-=y : "+(int)(x-=y));
        System.out.println("x*=y : "+(int)(x*=y));
        System.out.println("x/=y : "+(x/=y));
        System.out.println("x%=y : "+(x%=y));
        System.out.println("x%=y : "+(x));

        input.close();
    }
}
