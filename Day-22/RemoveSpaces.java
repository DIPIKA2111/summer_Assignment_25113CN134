import java.util.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text with spaces: ");
        String original = sc.nextLine();
        
        String result = ""; // Start with an empty text
        
        // Loop through each character of the text
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            
            // If the character is NOT a space, add it to our result
            if (ch != ' ') {
                result += ch;
            }
        }
        
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
