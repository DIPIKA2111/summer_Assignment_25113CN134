public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert character to string to check if result already has it
            if (!result.contains(ch + "")) {
                result += ch;
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result);
    }
}
