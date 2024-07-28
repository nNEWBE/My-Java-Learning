import java.util.Scanner;

public class Assignment_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if (age >= 18)
            System.out.println("You are a valid  voter");
        else
            System.out.println("You are a invalid  voter");
            
        input.close();
    }

}
