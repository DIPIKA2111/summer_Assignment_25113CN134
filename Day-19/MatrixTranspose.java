import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for the matrix
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Initialize original and transpose matrices
        int[][] matrix = new int[rows][cols];
        // The dimensions are swapped for the transpose matrix
        int[][] transposeMatrix = new int[cols][rows];

        // Input elements for the matrix
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Perform transposition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Row indices become column indices and vice versa
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
