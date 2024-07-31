public class Inheritance {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displaInformations() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        InnerInheritance inherited = new InnerInheritance();
        inherited.setName("Shuvo Chandra Deb Nath");
        inherited.setAge(21);
        inherited.setQualification("Student");
        inherited.displaInformations_2();
    }
}
