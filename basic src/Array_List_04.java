import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_List_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 9, 2, 7, 6, 4, 8, 0));

        System.out.println("Original Array List : " + list);
        // * Alternative to sort a list list.sort(null); 

        Collections.sort(list);
        System.out.println("Sorted Array List in Ascending order: " + list);
        Collections.sort(list, Collections.reverseOrder()); // # reverse the list and convert it to descending order without a sorted list 
        System.out.println("Sorted Array List in Descending order: " + list);
        Collections.reverse(list); // ? reverse the list 
        System.out.println("Sorted Array List in Ascending order: " + list);
    }
}
