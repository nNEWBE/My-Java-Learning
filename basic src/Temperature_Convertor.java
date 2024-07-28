import java.util.Scanner;

public class Temperature_Convertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in celcius : ");
        Double celcius = input.nextDouble();
        System.out.print("The temperature in fehrenheit is : " + (((celcius * 9) / 5) + 32));
        input.close();
    }

}
