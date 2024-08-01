public class Problem_01 {

    abstract public class Shape {
        double dim1, dim2;

        Shape(double dim1, double dim2) {
            this.dim1 = dim1;
            this.dim2 = dim2;
        }

        abstract void area();
    }

    public class Rectangle extends Shape {

        Rectangle(double dim1, double dim2) {
            super(dim1, dim2);
        }

        void area() {
            System.out.println("Area of rectangle: " + (dim1 * dim2));
        }
    }

    public class Triangle extends Shape {

        Triangle(double dim1, double dim2) {
            super(dim1, dim2);
        }

        void area() {
            System.out.println("Area of triangle: " + (0.5 * dim1 * dim2));
        }
    }

    public class Circle extends Shape {

        Circle(double r) {
            super(r, r);
        }

        void area() {
            System.out.println("Area of circle: " + (Math.PI * dim1 * dim1));
        }
    }

    public static void main(String[] args) {
        Problem_01 pb = new Problem_01();
        Shape shape;

        shape = pb.new Rectangle(5, 10);
        shape.area();

        shape = pb.new Triangle(5, 10);
        shape.area();

        shape = pb.new Circle(5);
        shape.area();
    }
}