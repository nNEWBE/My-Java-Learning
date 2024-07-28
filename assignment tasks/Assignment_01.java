import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int phonePrice = 1800; //# 1800 euros 
            int numberOfInstallment;
            double installmentPerMonth;

            System.out.print("Enter number of installment you want to assign : ");
            numberOfInstallment = input.nextInt();

            installmentPerMonth = (double) phonePrice / numberOfInstallment;

            System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");
        }

    }
}