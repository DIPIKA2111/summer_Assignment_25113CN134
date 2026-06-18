import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        
        // Handle empty input safely
        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            // Split the sentence by one or more spaces
            String[] words = sentence.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
        
        sc.close();
    }
}
