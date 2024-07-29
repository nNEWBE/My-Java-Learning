public class Static_Method {
    static void displayMethod() {
        System.out.println("This is a static method.");
    }

    void displayMethod_2() {
        System.out.println("This is a non static method.");
    }

    public static void main(String[] args) {
        Static_Method staticMethod = new Static_Method();
        staticMethod.displayMethod_2();

        Static_Method.displayMethod();
    }
}

// ! Static method restricion
// * A static method can not use any non static methods or any non static variables
// ? But a non static method can use any static methods or any static variables
