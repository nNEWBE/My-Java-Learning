import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int number = input.nextInt();
        int count = 0;

        if (number <= 1)
            count++;
        else {
            //! Alternative Approaches : 
            //# for (int i = 2; i < number; i++) {  
            //? for (int i = 2; i <= number / 2; i++) {  
            for (int i = 2; i <= Math.sqrt(number); i++) { //* Most efficient approach  
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
        }

        if (count == 0)
            System.out.println("The number " + number + " is a prime number");
        else
            System.out.println("The number " + number + " is not a prime number");

        input.close();
    }

}