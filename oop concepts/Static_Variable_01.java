public class Static_Variable_01 {
    String name;
    int id;
    static String University_Name = "Gono University";

    Static_Variable_01(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInformation()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + University_Name);
    }

    public static void main(String[] args) {
        Static_Variable_01 var = new Static_Variable_01("Shuvo", 23151010);
        var.displayInformation();

        System.out.println();
        Static_Variable_01 var_2 = new Static_Variable_01("Person", 23151010);
        var_2.displayInformation();
        
        System.out.println();
        System.out.println("The name of my university is : "+Static_Variable_01.University_Name); //* Static variable can be accessed by class name 
    }
}
