import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String original = sc.nextLine();
        
        // Reverse the original string using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();
        
        // Check if original and reversed match (ignoring upper/lower case)
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
        
        sc.close();
    }
}
