import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine(); //* next() will take only the first word before space 
        System.out.print("Enter your age : ");
        double age = input.nextDouble();
        System.out.print("Enter your roll : ");
        long number = input.nextInt();

        System.out.println("Your name is : "+name+",\nYour age is : "+age+"\nand, Your roll is : "+number);

        input.close();
    }
}

