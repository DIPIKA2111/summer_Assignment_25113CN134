import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int choice;

        do {
            // Display clean, simple menu
            System.out.println("\n--- STRING MENU ---");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to UPPERCASE");
            System.out.println("3. Convert to lowercase");
            System.out.println("4. Join with another string");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input memory buffer

            switch (choice) {
                case 1: // LENGTH
                    System.out.println("Length is: " + str.length());
                    break;

                case 2: // UPPERCASE
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 3: // LOWERCASE
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 4: // CONCATENATION
                    System.out.print("Enter second string to join: ");
                    String secondStr = scanner.nextLine();
                    System.out.println("Joined String: " + str.concat(secondStr));
                    break;

                case 5: // EXIT
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
