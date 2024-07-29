import java.util.Scanner;

public class Return_Method {
    int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();

            Return_Method s = new Return_Method();
            System.out.println("The sqare of " + number + " is : " + s.square(number));
        }
    }
}
