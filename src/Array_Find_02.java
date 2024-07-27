public class Array_Find_02 {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
            }
        }

        for (int[] element : array) {
            for (int num : element) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
