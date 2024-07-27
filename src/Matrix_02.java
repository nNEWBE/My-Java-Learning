import java.util.Scanner;

public class Matrix_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cols : ");
        int cols = input.nextInt();
        System.out.print("Enter rows : ");
        int rows = input.nextInt();
        int sumOfDiagonalElements = 0, sumOfUpperTriangleElements = 0, sumOfLowerTriangleElements = 0;
        int[][] matrix = new int[rows][cols];
        System.out.println("\nEnter the elements of the matrix.");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nMatrix.");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j)
                    sumOfDiagonalElements += matrix[i][j];
                if (i < j)
                    sumOfUpperTriangleElements += matrix[i][j];
                if (i > j)
                    sumOfLowerTriangleElements += matrix[i][j];
            }
        }

        System.out.println("\nSum of diagonal elements: " + sumOfDiagonalElements);
        System.out.println("Sum of upper trigonal elements: " + sumOfUpperTriangleElements);
        System.out.println("Sum of lower trigonal elements: " + sumOfLowerTriangleElements);

        input.close();
    }
}
