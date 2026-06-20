public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
            return;
        }

        // Combine the first string with itself
        String combined = str1 + str1;

        // Check if the combined string contains the second string
        if (combined.contains(str2)) {
            System.out.println("It is a rotation");
        } else {
            System.out.println("Not a rotation");
        }
    }
}