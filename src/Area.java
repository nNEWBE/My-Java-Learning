import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, radius, area_1, area_2;
        System.out.print("Enter a base : ");
        base = input.nextDouble();
        System.out.print("Enter a height : ");
        height = input.nextDouble();
        System.out.print("Enter a radius : ");
        radius = input.nextDouble();
        area_1 = .5 * base * height;
        area_2 = Math.PI * Math.pow(radius, 2);
        System.out.println("Are of triangle is : " + area_1);
        System.out.println("Are of circle is : " + area_2);
        input.close();
    }
}
