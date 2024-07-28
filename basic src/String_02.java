public class String_02 {
    public static void main(String[] args) {
        String first_name = "Shuvo";
        String last_name = new String(" Chandra");

        String full_name = first_name.concat(last_name);
        System.out.println("Full name is : " + full_name);

        System.out.println("The full_name in lowercase is : " + full_name.toLowerCase());
        System.out.println("The full_name in uppercase is : " + full_name.toUpperCase());

        System.out.println(full_name.startsWith("Sh")?"The full_name starts with Sh":"The full_name does not starts with Sh");
        System.out.println(full_name.endsWith("ra")?"The full_name ends with ra":"The full_name does not ends with ra");

    }
}
