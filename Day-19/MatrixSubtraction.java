import java.util.*;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = sc.nextInt();

        // Input dimensions for the second matrix
        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = sc.nextInt();

        // Check if matrix subtraction is possible
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Error: Matrices must have the same dimensions to be subtracted.");
            sc.close();
            return;
        }

        // Initialize matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] differenceMatrix = new int[rows1][cols1];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform element-by-element subtraction
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                differenceMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Print the resulting difference matrix
        System.out.println("\nResulting Difference Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(differenceMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
