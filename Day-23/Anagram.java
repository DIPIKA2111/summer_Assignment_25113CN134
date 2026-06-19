import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        // Step 2: Convert to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Step 4: Compare sorted arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
