import java.util.*;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size for the square matrix
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = sc.nextInt();

        // Initialize the square matrix
        int[][] matrix = new int[n][n];

        // Input elements for the matrix
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        // Optimized single-loop calculation
        for (int i = 0; i < n; i++) {
            // Primary diagonal elements are at index [i][i]
            primarySum += matrix[i][i];
            
            // Secondary diagonal elements are at index [i][n - 1 - i]
            secondarySum += matrix[i][n - 1 - i];
        }

        // Print the matrix for visualization
        System.out.println("\nYour Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Output the results
        System.out.println("\nSum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);

        sc.close();
    }
}
