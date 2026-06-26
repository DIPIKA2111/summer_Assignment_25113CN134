import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        // Initialize the Scanner utility class for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the interactive menu options
            System.out.println("\n=================================");
            System.out.println("     MENU-DRIVEN CALCULATOR      ");
            System.out.println("=================================");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            // Reading the user's operation choice
            choice = scanner.nextInt();

            // Handle program termination early if choice is 5
            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Exiting...");
                break;
            }

            // Verify if choice falls into the valid arithmetic operations
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                double result;

                // Executing calculation based on chosen case block
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 4:
                        // Input validation checking to prevent critical division by zero error
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is undefined.");
                        } else {
                            result = num1 / num2;
                            System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, result);
                        }
                        break;
                }
            } else {
                System.out.println("Invalid choice! Please select an option between 1 and 5.");
            }

        } while (choice != 5); // The loop repeats until the user chooses to exit

        // Closing the scanner to prevent memory leaks
        scanner.close();
    }
}
