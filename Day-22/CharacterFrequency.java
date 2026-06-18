import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        
        int[] count = new int[256];
        
        // Step 1: Count frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            count[ch]++; 
        }
        
        // Step 2: Print frequencies
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) { // Only print characters that appeared
                System.out.println("'" + (char)i + "' : " + count[i]);
            }
        }
        
        sc.close();
    }
}
