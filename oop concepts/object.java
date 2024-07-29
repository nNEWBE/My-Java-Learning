public class object {
    public static void main(String[] args) {
        System.out.println();

        Student s = new Student();
        s.setInformation("Shuvo", 23151010, 36, true);
        s.displayStudent();

        Student s_2 = new Student();
        s_2.setInformation("Person", 23151012, 36, true);
        s_2.displayStudent();

    }
}
