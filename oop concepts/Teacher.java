public class Teacher {
        String name,gender;
        long phone;
        int age;

        Teacher()
        {
            System.out.println("This is a constructor.");
        }

        Teacher(String name, String gender){
            this.name = name;
            this.gender = gender;
        }

        Teacher(String name, String gender, long phone, int age){
            this.name = name;
            this.gender = gender;
            this.phone = phone;
            this.age = age;
        }

        void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
        }
        void displayDetails_2(){
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Phone: " + phone);
            System.out.println("Age: " + age);
        }

}
