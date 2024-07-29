public class Student {
    String name;
    int roll, batch;
    boolean isStudent;

    void setInformation(String n, int r, int b, boolean st) {
        name = n;
        roll = r;
        batch = b;
        isStudent = st;
    }

    void displayStudent() {
        System.out.println("My name is " + name);
        System.out.println("I am a " + (isStudent ? "Student" : "Teacher"));
        System.out.println("My roll is " + roll);
        System.out.println("My bath no. is " + batch + "\n");
    }
}
