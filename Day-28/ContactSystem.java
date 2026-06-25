import java.util.Scanner;

public class ContactSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Fixed arrays to store up to 10 contacts
        String[] names = new String[10];
        String[] phoneNumbers = new String[10];
        int contactCount = 0; // Tracks total saved contacts

        while (true) {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add New Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            if (choice == 1) {
                // 1. Add Contact
                if (contactCount >= 10) {
                    System.out.println("Contact list is full! Cannot add more.");
                } else {
                    System.out.print("Enter contact name: ");
                    names[contactCount] = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    phoneNumbers[contactCount] = scanner.nextLine();
                    contactCount++;
                    System.out.println("Contact saved successfully!");
                }
            } 
            else if (choice == 2) {
                // 2. View All Contacts
                if (contactCount == 0) {
                    System.out.println("No contacts saved yet.");
                } else {
                    System.out.println("\n--- Saved Contacts ---");
                    for (int i = 0; i < contactCount; i++) {
                        System.out.println((i + 1) + ". Name: " + names[i] + " | Phone: " + phoneNumbers[i]);
                    }
                }
            } 
            else if (choice == 3) {
                // 3. Search Contact
                if (contactCount == 0) {
                    System.out.println("No contacts available to search.");
                } else {
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < contactCount; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Contact Found -> Name: " + names[i] + " | Phone: " + phoneNumbers[i]);
                            found = true;
                            break; // Stop loop once match is found
                        }
                    }
                    if (!found) {
                        System.out.println("No contact found with the name: " + searchName);
                    }
                }
            } 
            else if (choice == 4) {
                // 4. Exit
                System.out.println("Exiting application. Goodbye!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }
    }
}
