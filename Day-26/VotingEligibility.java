import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Define the legal voting age constant
        final int VOTING_AGE = 18;
        
        System.out.println("=== Voting Eligibility Checker ===");
        System.out.print("Please enter your age: ");
        
        // Read the integer input from the user
        int age = sc.nextInt();
        
        // Check eligibility using a conditional if-else statement
        if (age >= VOTING_AGE) {
            System.out.println("Status: Eligible. You are old enough to vote!");
        } else {
            // Calculate how many years are left until eligibility
            int yearsLeft = VOTING_AGE - age;
            System.out.println("Status: Not Eligible.");
            System.out.println("You must wait " + yearsLeft + " more year(s) to vote.");
        }
        
        // Close the scanner resource
        sc.close();
    }
}
