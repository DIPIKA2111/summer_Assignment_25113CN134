public class ColumnWiseSum {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Loop through each column
        for (int j = 0; j < cols; j++) {
            int colSum = 0; // Reset sum for the current column

            // Loop through each row for the current column
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }

            // Print the sum of the current column
            System.out.println("Sum of Column " + (j + 1) + " = " + colSum);
        }
    }
}
