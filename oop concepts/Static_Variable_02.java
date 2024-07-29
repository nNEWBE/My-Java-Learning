public class Static_Variable_02 {
    static int count = 0;

    Static_Variable_02()
    {
        count++;
    }

    void display()
    {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Static_Variable_02 v_1 = new Static_Variable_02();
        v_1.display();
        Static_Variable_02 v_2 = new Static_Variable_02();
        v_2.display();
        Static_Variable_02 v_3 = new Static_Variable_02();
        v_3.display();
    }
}
