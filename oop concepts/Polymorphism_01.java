public class Polymorphism_01 {
    public class Person {
        void display() {
            System.out.println("I am a Person");
        }
    }

    public class Student extends Person {
        @Override
        void display() {
            System.out.println("I am a Student");
        }
    }

    public class Teacher extends Person {
        @Override
        void display() {
            System.out.println("I am a Teacher");
        }
    }

    public static void main(String[] args) {
        Polymorphism_01 outer = new Polymorphism_01();
        Person p1 = outer.new Person();
        p1.display();

        p1= outer.new Student();
        p1.display();

        p1= outer.new Teacher();
        p1.display();
        
    }
}
