import java.util.Scanner;

public class Capital_Small_Letter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any chracter : ");
        char c = input.next().charAt(0);

        if (c >= 'a' && c <= 'z')
            System.out.println("The character is small");
        else if (c >= 'A' && c <= 'Z')
            System.out.println("The character is capital");
        else
            System.out.println("This is not a valid character");
            
        input.close();
    }

}
