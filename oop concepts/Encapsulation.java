public class Encapsulation {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Shuvo Chandra Deb Nath");
        encapsulation.setAge(21);
        System.out.println("Name: " + encapsulation.getName());
        System.out.println("Age: " + encapsulation.getAge());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
