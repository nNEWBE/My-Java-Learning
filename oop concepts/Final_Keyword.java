public class Final_Keyword {
    public class Final { // ! "final public class Final" // final class can not be extended
        final String name = "final";
        final int value; // * This is a blank final variable it can only be initialized in a constructor
        static final int id; // ? This is a static blank final variable it can only be initialized in a static block

        Final() {
            value = 10;
        }

        static {
            id = 20;
        }

        final void display() {
            System.out.println("Name : " + name);
            System.out.println("Value : " + value);
            System.out.println("ID : " + id);
        }
    }

    public class Override extends Final {
        void display_2() { // # Final method can not be overridden
            System.out.println("This is the override method");
        }
    }

    public static void main(String[] args) {
        Final_Keyword keyword = new Final_Keyword();
        Override override_obj = keyword.new Override();
        override_obj.display();
        override_obj.display_2();
    }
}
