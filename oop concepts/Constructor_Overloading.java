public class Constructor_Overloading {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Teacher teacher = new Teacher();
        System.out.println();

        Teacher teacher_2 = new Teacher("Shuvo","Male");
        teacher_2.displayDetails();
        System.out.println();

        Teacher teacher_3 = new Teacher("Teacher", "Male",1718729409,32);
        teacher_3.displayDetails_2();
    }
}
