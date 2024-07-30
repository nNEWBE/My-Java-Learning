public class Methode_Overloading {
    void add() {
        System.out.println("This is an empty method");
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    void add(int a, int b, int c, int d) {
        System.out.println("Sum = " + (a + b + c + d));
    }

    public static void main(String[] args) {
        Methode_Overloading mo = new Methode_Overloading();
        mo.add();
        mo.add(10, 20);
        mo.add(10, 20, 30);
        mo.add(10, 20, 30, 40);
    }

}
