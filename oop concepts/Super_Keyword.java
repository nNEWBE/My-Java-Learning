public class Super_Keyword {

    public class Super {
        int x = 10;
        void display()
        {
            System.out.println("Inside Super class");
        }
        Super(int x)
        {
            System.out.println("Inside Super class constructor");
            System.out.println("The value of x is : " + x);
        }
    }

    public class Derived extends Super {
        int x = 20;

        void display() {
            super.display();
            System.out.println("This prints the value of super variable " + super.x);
            System.out.println("This prints the value of derived variable " + x);
        }

        Derived(int x)
        {
            super(x);
            System.out.println("Inside Derived class constructor");
        }
    }

    public static void main(String[] args) {
        Super_Keyword sk = new Super_Keyword();
        Derived d = sk.new Derived(5);
        d.display();
    }
}
