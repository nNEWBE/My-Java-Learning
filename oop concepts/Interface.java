public class Interface {
    public interface Animal {
        void print();
    }

    public interface Human {
        void print();
    }

    public class Dog implements Animal {
        public void print() {
            System.out.println("This is a dog!");
        }
    }

    public class Cat implements Animal {
        public void print() {
            System.out.println("This is a cat!");
        }
    }

    public class Food implements Animal, Human { // # Multiple inheritance
        public void print() {
            System.out.println("This is a Food!");
        }
    }

    public static void main(String[] args) {
        Interface in = new Interface();

        Dog dog = in.new Dog();
        dog.print();

        Cat cat = in.new Cat();
        cat.print();

        Food food = in.new Food();
        food.print();
    }
}
