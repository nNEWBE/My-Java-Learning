public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Shuvo");
        builder.append(" Chandra");
        System.out.println("String after appending : " + builder);
        builder.reverse();
        System.out.println("String after reversing : " + builder);
        builder.reverse().delete(6, builder.length());
        System.out.println("String after deleting : " + builder);
    }
}
