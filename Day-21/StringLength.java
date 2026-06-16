import java.util.*;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        // Counter variable to keep track of characters
        int count = 0;
        
        // Convert the string to a character array and loop through it
        for (char ch : text.toCharArray()) {
            count++;
        }
        
        System.out.println("Length of the string is: " + count);
        
        sc.close();
    }
}
