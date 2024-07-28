public class String_03 {
    public static void main(String[] args) {
        String country = "      Bangladesh is my country        ";
        System.out.println(country);

        String trim = country.trim();
        System.out.println("The country using trim is : " + trim);

        char ch = country.charAt(0);
        System.out.println("The char at 0 index of country is : " + ch);

        int value = country.codePointAt(0);
        System.out.println("The ascii value of char at 0 index of country is : " + value);

        int index = country.indexOf("is");
        System.out.println("The index of \"is\" in country is : " + index);

        int last_index = country.lastIndexOf("n");
        System.out.println("The last index of \"n\" in country is : " + last_index);

        String change = country.replace("my", "our");
        System.out.println(change);

        String[] arr = trim.split(" ");
        for (String a : arr)
            System.out.println(a);
        
    }
}
