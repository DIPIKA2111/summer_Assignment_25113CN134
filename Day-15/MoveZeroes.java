import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroPos =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos++;
            }
        }
        while (nonZeroPos < arr.length) {
            arr[nonZeroPos] = 0;
            nonZeroPos++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Call the function
        moveZeroesToEnd(numbers);

        System.out.println("Array after moving zeroes: " + Arrays.toString(numbers));
    }
}