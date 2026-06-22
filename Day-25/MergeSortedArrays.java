import java.util.Arrays;

public class MergeSortedArrays {
    
    // Function to merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for result array
        
        // Traverse both arrays and copy the smaller element
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements of arr1, if any
        while (i < n) {
            result[k++] = arr1[i++];
        }
        
        // Copy remaining elements of arr2, if any
        while (j < m) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = merge(array1, array2);

        // Output the results
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
