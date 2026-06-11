import java.util.Arrays;

public class RotateRight {
    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        
        
        d = d % n; 
        
        
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, 0, n - 1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int d = 2; // Number of positions to rotate right
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Call the rotate function
        rotateRight(numbers, d);
        
        System.out.println("Right Rotated Array: " + Arrays.toString(numbers));
    }
}