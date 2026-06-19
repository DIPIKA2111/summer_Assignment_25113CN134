public class FirstRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        
        // Pick each character one by one
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            
            // Look ahead to see if it appears again
            for (int j = i + 1; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    System.out.println("First repeating character is: " + current);
                    return; // Stop immediately
                }
            }
        }
        
        System.out.println("No repeating character found.");
    }
}
