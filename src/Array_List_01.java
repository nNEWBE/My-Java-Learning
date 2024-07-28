import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_01 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Size of the ArrayList is : " + array.size());
        
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(4, 50);
        
        // @SuppressWarnings("rawtypes")

        Iterator<Integer> itr = array.iterator(); 
        System.out.print("Using Iterator : ");
        while(itr.hasNext())
        System.out.print(itr.next()+" ");

        System.out.println();

        System.out.print("Using for each : ");
        for(int element: array)System.out.print(element+" ");

        System.out.println();

        System.out.println("The ArrayList is : " + array);
        System.out.println("Size of the ArrayList is : " + array.size());

        array.remove(2);
        System.out.println("The ArrayList after removing : " + array);

        array.removeAll(array);
        array.clear(); //# clear() and remove() works same 

        System.out.println("The ArrayList after removing all : " + array);
        System.out.println("Size of the ArrayList after removing : " + array.size());

        System.out.println("Using isEmpty() method : " + array.isEmpty());
    }
}




//!           Array                            ArrayList           
//?   (i)   Not Resizable             (i)   Resizable              
//do  (ii)  for, for each loop        (ii)  for each, iterator     
//#   (iii) Fast                      (iii) Slow                   
//*   (iv)  array.length              (iv)  array.size()           