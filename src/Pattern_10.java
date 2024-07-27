import java.util.Scanner;

public class Pattern_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if(i==1 || i==number || j==1 || j==i) 
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if(j==1 || i==number || i==j) 
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        input.close();
        
    }

}
