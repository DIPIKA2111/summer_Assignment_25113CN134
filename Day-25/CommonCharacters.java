import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }

        // Initialize the global minimum frequencies with the first word
        int[] minFreq = new int[26];
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }

        // Update frequencies based on the remaining words
        for (int i = 1; i < words.length; i++) {
            int[] currentFreq = new int[26];
            for (char c : words[i].toCharArray()) {
                currentFreq[c - 'a']++;
            }

            // Keep the minimum count for each character
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], currentFreq[j]);
            }
        }

        // Convert the frequency map into the final result list
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(Character.toString((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List<String> common = commonChars(words);

        System.out.println("Input Words: " + java.util.Arrays.toString(words));
        System.out.println("Common Characters: " + common);
    }
}
