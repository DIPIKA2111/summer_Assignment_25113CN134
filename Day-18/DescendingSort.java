import java.util.*;

public class DescendingSort {
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        
        // 1. Sort in ascending order: [11, 12, 22, 25, 34, 64, 90]
        Arrays.sort(data);
        
        
        int left = 0;
        int right = data.length - 1;
        while (left < right) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
        
        System.out.println("Descending Order: " + Arrays.toString(data));
    }
}