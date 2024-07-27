import java.util.Scanner;

public class Matrix_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cols : ");
        int cols = input.nextInt();
        System.out.print("Enter rows : ");
        int rows = input.nextInt();
        int[][] matrix_1 = new int[rows][cols];
        System.out.println("\nEnter the elements of the matrix_1.");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix_1[%d][%d] = ", i, j);
                matrix_1[i][j] = input.nextInt();
            }
        }
        int[][] matrix_2 = new int[rows][cols];
        System.out.println("\nEnter the elements of the matrix_2.");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix_2[%d][%d] = ", i, j);
                matrix_2[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatrix_1.");
        for (int[] row : matrix_1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix_2.");
        for (int[] row : matrix_1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix_1 + Matrix_2.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((matrix_1[i][j] + matrix_2[i][j]) + " ");
            }
            System.out.println();
        }

        input.close();
    }

}