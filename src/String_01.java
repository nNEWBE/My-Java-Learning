public class String_01 {
    public static void main(String[] args) {
        String name = "Shuvo";
        String full_name = new String("Shuvo Chandra Deb Nath");
        char[] ch = { 'C', 'h', 'a', 'n', 'd', 'r', 'a' };

        System.out.println("This is a string : " + name);
        System.out.println("This is a char array : " + new String(ch));
        System.out.println("Length of full name is : " + full_name.length());

        System.out.println(
                full_name.contains(name) ? "Yes, full_name contains name" : "No, full_name doesnot contains name");
        System.out.println(full_name.equals(name) ? "Yes, full_name is equals to name"
                : "No, full_name is doesnot equals to name");
        System.out.println(name.equalsIgnoreCase("ShuVo") ? "Yes, name is equals to \"shuvo\""
                : "No, name is doesnot equals to \"shuvo\"");
        System.out.println(name.isEmpty() ? "The string name is empty" : "The string name is not empty");

    }
}
