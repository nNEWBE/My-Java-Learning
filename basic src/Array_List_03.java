import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_03 {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> list_2 = new ArrayList<Integer>() {
            {
                add(50);
                add(60);
                add(70);
                add(80);
            }
        };
        ArrayList<Integer> list_3 = new ArrayList<Integer>();

        list_1.addAll(list_2);
        System.out.println("The elements of the list_1 are: " + list_1);
        list_1.removeAll(list_2);
        System.out.println("The elements of the list_1 are: " + list_1);
        list_3.addAll(list_1);
        System.out.println("The elements of the list_3 are: " + list_3);
        System.out.println("Does the list_1 and list_3 are equal? : "+list_1.equals(list_3));

    }
}
