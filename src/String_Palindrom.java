import java.util.Scanner;

public class String_Palindrom {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string : ");
            String str = input.nextLine();
            StringBuffer sb = new StringBuffer(str);

            System.out.println(sb.reverse().toString().equals(str) ? "The string " + str + " is a string palindrome"
                    : "The string " + str + " is not a string palindrome");

        }

    }

}
