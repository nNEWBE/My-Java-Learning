import java.util.Scanner;

public class Assignment_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Have you completed your masters ? y/n : ");
        char masters = input.next().charAt(0);
        System.out.print("Are you fluent in English ? y/n : ");
        char fluent = input.next().charAt(0);

        if (Character.toLowerCase(masters) == 'y' && Character.toLowerCase(fluent) == 'y')
            System.out.println("You are eligible for the job interview");
        else if (Character.toLowerCase(masters) == 'y' && Character.toLowerCase(fluent) == 'n')
            System.out.println("You are not eligible for the job interview");
        else if (Character.toLowerCase(masters) == 'n' && Character.toLowerCase(fluent) == 'y')
            System.out.println("You are not eligible for the job interview");
        else if (Character.toLowerCase(masters) == 'n' && Character.toLowerCase(fluent) == 'n')
            System.out.println("You are not eligible for the job interview");
        else
            System.out.println("You entered an invalid key");

        input.close();
    }

}