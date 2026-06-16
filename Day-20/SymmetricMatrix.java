public class SymmetricMatrix {
    public static void main(String[] args) {
        // A 3x3 matrix to check
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean isSymmetric = true;

        // 1. A symmetric matrix MUST be square (Rows must equal Columns)
        if (rows != cols) {
            isSymmetric = false;
        } else {
            // 2. Check if matrix[i][j] equals matrix[j][i]
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break; // Stop checking if a mismatch is found
                    }
                }
            }
        }

        // Print the final result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is NOT symmetric.");
        }
    }
}
