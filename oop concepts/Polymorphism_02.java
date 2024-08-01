public class Polymorphism_02 {

    public class Shape {
        double area() {
            return 0;
        }
    }

    public class Rectangle extends Shape {
        double length, width;

        Rectangle(double length, double width)
        {
            this.length = length;
            this.width = width;
        }

        double area() {
            return length * width;
        }

    }

    public class Triangle extends Shape {
        double base, height;

        Triangle(double base, double height)
        {
            this.base = base;
            this.height = height;
        }

        double area() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Polymorphism_02 poly = new Polymorphism_02();
        Shape[] array = new Shape[3];
        array[0] = poly.new Shape();
        array[1] = poly.new Rectangle(10,20);
        array[2] = poly.new Triangle(30,40);

        for (Polymorphism_02.Shape each : array) {
            System.out.println(each.area());
        }

    }
}
