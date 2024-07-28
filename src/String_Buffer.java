public class String_Buffer {
    public static void main(String[] args) {
        String s = "Shuvo";
        StringBuffer name = new StringBuffer(s);
        System.out.println("StringBuffer at initial position : " + name);

        name.append(" Chandra");
        System.out.println("StringBuffer after append operation : " + name);

        name.reverse();
        System.out.println("StringBuffer after reverse operation : " + name);

        name.delete(0, 8);
        System.out.println("StringBuffer after delete operation : " + name);

        name.reverse().append(" Chandra");
        System.out.println("StringBuffer after reverse and append operation : " + name);

        name.setLength(5);
        System.out.println("StringBuffer after set length operation : " + name);

    }
}
