public class Instanceof_Operator {
   
    public class Person {
    
        
    }

    public class Student  extends Person{
    
        
    }

    public class Teacher  extends Student{
    
        
    }
    
    public static void main(String[] args) {
        Instanceof_Operator outer = new Instanceof_Operator();

        Person p = outer.new Person();
        Student s = outer.new Student();
        Teacher t = outer.new Teacher();

        System.out.println(s instanceof Person);
        System.out.println(t instanceof Person);
        System.out.println(t instanceof Student);
        System.out.println(p instanceof Student);
        System.out.println(p instanceof Teacher);
    }
}
