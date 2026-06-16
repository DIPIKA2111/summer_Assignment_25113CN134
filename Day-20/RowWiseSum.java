public class RowWiseSum {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0; // Reset sum for the current row

            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            // Print the sum of the current row
            System.out.println("Sum of Row " + (i + 1) + " = " + rowSum);
        }
    }
}
