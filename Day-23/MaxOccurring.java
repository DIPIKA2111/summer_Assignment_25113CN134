public class MaxOccurring {
    public static void main(String[] args) {
        String str = "test sample";
        
        char maxChar = ' ';
        int maxCount = 0;
        
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int currentCount = 0;
            
            // Count how many times this character appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    currentCount++;
                }
            }
            
            // Update maximum if a higher count is found
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = current;
            }
        }
        
        System.out.println("Maximum occurring character is: " + maxChar);
    }
}
