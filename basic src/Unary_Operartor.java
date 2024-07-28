import java.util.Scanner;

public class Unary_Operartor {

    public static void main(String[] args) {

        // ! Unary Plus ==> +  
        // ? Unary Minus ==> -  
        // * Increment ==> ++  
        // do Decrement ==> --  

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.err.println("+" + number + " = " + (+number));
        System.err.println("-" + number + " = " + (-number));
        System.err.println(number + "++ = " + (number++));
        System.err.println(number + "-- = " + (number--));
        System.err.println("++" + number + " = " + (++number));
        System.err.println("--" + number + " = " + (--number));
        input.close();
    }

}
