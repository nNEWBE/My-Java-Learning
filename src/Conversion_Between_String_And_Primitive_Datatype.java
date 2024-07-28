public class Conversion_Between_String_And_Primitive_Datatype {

    public static void main(String[] args) {

        // // Primitive Data type to String Conversion
        System.out.println("Primitive Data type to String Conversion.");

        int i = 121;
        // * String s = String.valueOf(i);
        String s = Integer.toString(i);
        System.out.println(s);

        double d = 12.1;
        // ! String s_2 = String.valueOf(d);
        String s_2 = Double.toString(d);
        System.out.println(s_2);

        boolean b = true;
        // # String s_3 = String.valueOf(b);
        String s_3 = Boolean.toString(b);
        System.out.println(s_3);

        // // String to Primitive Data type Conversion
        System.out.println("\nString to Primitive Data type Conversion.");

        String str = "123";
        int i_2 = Integer.parseInt(str); //? Integer.valueOf(str);   // Alternatively
        System.out.println(i_2);

        String str_2 = "12.3";
        double d_2 = Double.parseDouble(str_2); //do Integer.valueOf(str);    // Alternatively
        System.out.println(d_2);

    }
}