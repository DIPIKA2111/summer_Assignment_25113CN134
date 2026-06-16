public class MatrixMultiplication {
    public static void main(String[] args) {
        // Matrix A (Size: 2x3)
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Matrix B (Size: 3x2)
        int[][] b = {
            {7, 8},
            {9, 1},
            {2, 3}
        };

        // Result Matrix (Size: 2x2)
        int[][] result = new int[2][2];

        // Multiplying the two matrices
        for (int i = 0; i < 2; i++) {         // Loops through rows of A
            for (int j = 0; j < 2; j++) {     // Loops through columns of B
                for (int k = 0; k < 3; k++) { // Loops for multiplication & addition
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Printing the result matrix
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Moves to the next line for the next row
        }
    }
}