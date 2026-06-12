public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 2, 2};
        
        int maxElement = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxElement = arr[i];
            }
        }

        System.out.println("The maximum frequency element is: " + maxElement);
        System.out.println("It appeared " + maxCount + " times.");
    }
}
