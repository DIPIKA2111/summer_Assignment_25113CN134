import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Print the final result
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
