public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String compressed = "";
        
        int count = 1;
        
        for (int i = 0; i < str.length(); i++) {
            // Check if the next character is the same
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append character and its count
                compressed += str.charAt(i) + "" + count;
                count = 1; // Reset count for the next character
            }
        }
        
        // Output the shorter result
        if (compressed.length() < str.length()) {
            System.out.println("Compressed: " + compressed);
        } else {
            System.out.println("Original: " + str);
        }
    }
}
