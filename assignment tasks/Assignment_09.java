import java.util.Scanner;

public class Assignment_09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int starting, ending, sum = 0;

        System.out.print("Enter a starting number : ");
        starting = input.nextInt();
        System.out.print("Enter an ending number : ");
        ending = input.nextInt();

        for (int i = starting; i <= ending; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The sum of odd numbers from " + starting + " to " + ending + " is : " + sum);
        input.close();
    }

}
