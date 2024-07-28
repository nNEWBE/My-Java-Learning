import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        System.out.println("Sum of the array is : " + (array[0] + array[1] + array[2] + array[3] + array[4]));
        System.out.println("Length of the array is : " + array.length);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int min=arr[0];
        for (int elements : arr) {
            if(max < elements)
            max = elements;
            else if (min > elements)
            min=elements;
            sum += elements;
        }

        System.out.println("Summation of the array elements is : " + sum);
        System.out.println("Average of the array elements is : " + (sum / arr.length));
        System.out.println("Maximum element of the array is : " +max);
        System.out.println("Minimum element of the array is : " +min);
        input.close();
    }
}
