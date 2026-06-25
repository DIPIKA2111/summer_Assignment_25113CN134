import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Account details
        String accountHolder = "";
        String accountNumber = "";
        double balance = 0.0;
        boolean isAccountCreated = false;

        while (true) {
            System.out.println("\n--- Simple Bank System ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            if (choice == 1) {
                // 1. Create Account
                if (isAccountCreated) {
                    System.out.println("An account already exists!");
                } else {
                    System.out.print("Enter account holder name: ");
                    accountHolder = scanner.nextLine();
                    System.out.print("Create account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: $");
                    balance = scanner.nextDouble();
                    
                    isAccountCreated = true;
                    System.out.println("Account created successfully!");
                }
            } 
            else if (choice == 2) {
                // 2. Check Balance
                if (!isAccountCreated) {
                    System.out.println("Please create an account first.");
                } else {
                    System.out.printf("Current Balance: $%.2f\n", balance);
                }
            } 
            else if (choice == 3) {
                // 3. Deposit Money
                if (!isAccountCreated) {
                    System.out.println("Please create an account first.");
                } else {
                    System.out.print("Enter deposit amount: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Success! Deposited $%.2f. New Balance: $%.2f\n", deposit, balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                }
            } 
            else if (choice == 4) {
                // 4. Withdraw Money
                if (!isAccountCreated) {
                    System.out.println("Please create an account first.");
                } else {
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Error: Insufficient funds.");
                    } else if (withdrawal <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("Success! Withdrew $%.2f. New Balance: $%.2f\n", withdrawal, balance);
                    }
                }
            } 
            else if (choice == 5) {
                // 5. View Details
                if (!isAccountCreated) {
                    System.out.println("No account data found.");
                } else {
                    System.out.println("\n--- Account Info ---");
                    System.out.println("Name: " + accountHolder);
                    System.out.println("Account No: " + accountNumber);
                    System.out.printf("Balance: $%.2f\n", balance);
                }
            } 
            else if (choice == 6) {
                // 6. Exit
                System.out.println("Thank you for using our banking system. Goodbye!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Please select 1 to 6.");
            }
        }
    }
}
