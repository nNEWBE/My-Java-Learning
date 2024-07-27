import java.util.Scanner;

public class Logical_Operator {
    public static void main(String[] args) {

        //! Logical And Operator = &&  
        //? Logical Or Operator = ||  
        //# Logical Not Operator = !  

         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        String grade;
        if (marks >= 90 && marks <=100) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else if (marks >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        String result = (marks >= 50) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
