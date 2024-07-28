import java.util.Scanner;

public class Pattern_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = input.nextInt();
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
        input.close();
    }

}
