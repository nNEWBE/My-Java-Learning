public class Static_Block {
    static String name;
    static int id;

    static{
        System.out.println("Static Block");
        name = "John";
        id =10;
    }
    static void display()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        System.out.println("Main Block\n");
        Static_Block.display();
    }
}
