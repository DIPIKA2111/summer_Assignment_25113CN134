import java.util.Arrays;

public class SortByLength {
    public static void main(String[] args) {
        String[] words = {"banana", "kiwi", "apple", "fig", "watermelon"};

        System.out.println("Original: " + Arrays.toString(words));

        // Use standard nested loops to sort by length
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                
                // Compare the lengths of adjacent words
                if (words[j].length() > words[j + 1].length()) {
                    // Swap the words if the current one is longer than the next one
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted by length: " + Arrays.toString(words));
    }
}
