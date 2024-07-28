public class Wrapper_Class {
    public static void main(String[] args) {
        
        // # Autoboxing 
        int x = 5;
        Integer y = Integer.valueOf(x); // do or, y = x will do the same thing  
        System.out.println("y = " + y);

        Integer z = x;
        System.out.println("z = " + z);

        // ? Unboxing   
        Double d = Double.valueOf(10.5);
        System.out.println("d = " + d);

        double e = d.doubleValue(); // @ or, e = d will do the same thing   
        System.out.println("e = " + e);

    }
}

// ! Autoboxing ==> converting primitive to object  
// * Unboxing ==> converting object to primitive    