//! import java.util.Arrays;


public class Two_D_Array {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;
        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;

        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

        // * System.out.println(Arrays.deepToString(array));
        //? Arrays.stream(array).flatMapToInt(Arrays::stream).forEach(element -> System.out.print(element + " "));
        //# Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);

        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
