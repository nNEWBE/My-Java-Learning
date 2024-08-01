public class Abstraction {
    abstract public class Mobile_User {
        abstract void sendMessage();

        void call() {
            System.out.println("This is from abstruct class");
        }
    }

    public class Rahim extends Mobile_User {
        @Override
        void sendMessage() {
            System.out.println("This message is sent by Rahim");
        }
    }

    public class Karim extends Mobile_User {
        @Override
        void sendMessage() {
            System.out.println("This message is sent by Karim");
        }
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        Mobile_User mu;
        mu = abstraction.new Rahim();
        mu.sendMessage();
        mu = abstraction.new Karim();
        mu.sendMessage();
        mu.call(); // * Abstraction can't directly access non-abstract method from abstract class
    }
}
