public class This_Keyword {

    public class Person {
        String name;
        int age;
        String hairColor;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person(String name, int age, String hairColor) {
            this(name, age);
            this.hairColor = hairColor;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Hair Color: " + hairColor);
        }
        
        public static void main(String[] args) {
            This_Keyword keyword = new This_Keyword();
            Person person = keyword.new Person("John Doe", 30,"Black");
            person.displayDetails();
        }

    }
}
