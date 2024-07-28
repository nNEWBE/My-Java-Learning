import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 2, 4, 9, 1, 8, 6, 0 };
        Arrays.sort(arr);

        System.out.print("Ascending : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("Descending : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        String[] name = { "Shuvo", "Ayon", "Amit", "Riyad", "Rokib", "Sakib", "Nayeem", "Sazzad" };
        Arrays.sort(name);

        System.out.println();
        System.out.println();

        System.out.print("Ascending : ");
        for (String element : name) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("Descending : ");
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }
    }
}
