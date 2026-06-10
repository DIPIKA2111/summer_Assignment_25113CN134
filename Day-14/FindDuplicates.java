public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) 
            return;

        System.out.print("Duplicate elements: ");
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] < 0) {
                System.out.print(index + " ");
                found = true;
            } else {
                arr[index] = -arr[index];
            }
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Elements  between 0 and n-1 (0 to 6 in this 7-element array)
        int[] numbers = {1, 2, 3, 1, 3, 6, 6};
        
        findDuplicates(numbers); 
        
    }
}
