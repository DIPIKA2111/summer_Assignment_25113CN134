public class MissingNumberSum {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        
        // Expected sum of 1 to N
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        // Calculate actual sum of array elements
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 3 is missing
        System.out.println("Missing number (Sum): " + findMissingNumber(arr));
    }
}