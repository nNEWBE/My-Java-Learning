public class Bin_Octal_Hex_To_Decimal {
    public static void main(String[] args) {

        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        String octal = "675";
        Integer  decimal_2= Integer.parseInt(octal, 8);
        System.out.println(decimal_2);

        String hexadecimal = "A";
        Integer  decimal_3= Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal_3);

    }
}
