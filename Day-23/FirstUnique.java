public class FirstUnique {
    public static void main(String[] args) {
        String str = "swiss";
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if first appearance matches the last appearance
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character is: " + ch);
                return; // Stop after finding the first one
            }
        }
        
        System.out.println("No non-repeating character found.");
    }
}
