public class Methode_Overriding {
    public class Student {
        String name;
        int age;

        void displaInformations() {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        }
    }

    public class Teacher extends Student {
        String qualification;

        @Override
        void displaInformations() {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Qualification : " + qualification);
        }
    }

    public static void main(String[] args) {
        Methode_Overriding methode = new Methode_Overriding();
        Teacher t = methode.new Teacher();
        t.name="Shuvo";
        t.age=21;
        t.qualification="Student";
        t.displaInformations();
    }
}
