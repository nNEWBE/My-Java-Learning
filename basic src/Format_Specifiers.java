public class Format_Specifiers {
    public static void main(String[] args) {
        boolean b = true;
        byte by = 10;
        short sh = 100;
        int i = 1000;
        long lg = 100000000;
        float f = 1.5f;
        double d = 10.5;
        char c = 's';
        String name= "Shuvo";

        System.err.printf("bool = %b\n", b);
        System.err.printf("by = %d\n", by);
        System.err.printf("sh = %d\n", sh);
        System.err.printf("i = %d\n", i);
        System.err.printf("lg = %d\n", lg);
        System.err.printf("c = %c\n", c);
        System.err.printf("name = %s\n", name);
        System.err.printf("f = %.1f\n", f);
        System.err.printf("d = %.1f", d);
    }
}
