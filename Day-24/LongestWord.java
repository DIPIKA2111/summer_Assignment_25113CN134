public class LongestWord {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        
        // Split the sentence by spaces into an array of words
        String[] words = sentence.split(" ");
        String longestWord = "";

        // Loop through the array to find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
    }
}
