public class ReverseString {
    public static void main(String[] args) {
        String text = "Hello";
        String reversed = "";

        // Start from the last character and move backwards
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
