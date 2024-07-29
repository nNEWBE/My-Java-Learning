public class Constructor {
    public static void main(String[] args) {
        Student student = new Student(); // * Default constructor
        student.displayStudent();
        
        Student student_2 = new Student("Shuvo", 23151010, 36, true); // ? Parameterized constructor
        student_2.displayStudent();

    }
}
