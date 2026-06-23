import java.util.*;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initial bank account setup
        double balance = 1000.00;
        int choice = 0;
        
        System.out.println("=== Welcome to the Java Bank ATM ===");
        
        // Loop runs until the user selects option 4 (Exit)
        while (choice != 4) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    // View current balance
                    System.out.printf("Your current balance is: $%.2f\n", balance);
                    break;
                    
                case 2:
                    // Deposit money
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited $%.2f. New balance: $%.2f\n", depositAmount, balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be greater than 0.");
                    }
                    break;
                    
                case 3:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    
                    if (withdrawAmount > balance) {
                        System.out.println("Transaction Failed! Insufficient funds.");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Withdrawal must be greater than 0.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew $%.2f. Remaining balance: $%.2f\n", withdrawAmount, balance);
                    }
                    break;
                    
                case 4:
                    // Exit application
                    System.out.println("Thank you for using Java Bank ATM. Goodbye!");
                    break;
                    
                default:
                    // Handle invalid menu options
                    System.out.println("Invalid choice! Please select a number between 1 and 4.");
            }
        }
        
        sc.close();
    }
}
