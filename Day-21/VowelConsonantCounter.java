import java.util.*;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert the string to lowercase to simplify comparisons
        String lowerCaseInput = input.toLowerCase();
        
        // Loop through each character of the string
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } 
            // Check if the character is a valid lowercase alphabet letter (consonant)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        // Display the final results
        System.out.println("Total Vowels: " + vowelCount);
        System.out.println("Total Consonants: " + consonantCount);
        
        sc.close();
    }
}
