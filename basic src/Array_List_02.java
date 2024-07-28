import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_02 {
    public static void main(String[] args) {
         ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Size of the ArrayList is : " + array.size());
        
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(4, 60);
        
        // @SuppressWarnings("rawtypes")

        Iterator<Integer> itr = array.iterator(); 
        System.out.print("Using Iterator : ");
        while(itr.hasNext())
        System.out.print(itr.next()+" ");

        System.out.println();
        
        System.out.println("Does the array contains 30? : "+array.contains(30));
        System.out.println("The index of element 30 is : "+array.indexOf(30));

        array.set(4,50);
        System.out.println("Array List using after setting : "+array);

        System.out.println("The element at index 0 is : "+ array.get(0));

    }
}
