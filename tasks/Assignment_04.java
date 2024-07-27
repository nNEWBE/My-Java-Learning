import java.util.Scanner;

public class Assignment_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you lovw java (y/Y/n/N) : ");
        int c = input.next().charAt(0);

        if (Character.toLowerCase(c) == 'y')
            System.out.println("You are a JAVA lover");
        else if (Character.toLowerCase(c) == 'n')
            System.out.println("You are not a JAVA lover");
        else
            System.out.println("You pressed an invalid key");
            
        input.close();
    }

}
