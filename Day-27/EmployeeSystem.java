import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] employees = new String[100]; // Stores up to 100 employee names
        int count = 0; // Tracks total employees added

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            if (choice == 1) {
                System.out.print("Enter employee name: ");
                employees[count] = scanner.nextLine();
                count++;
                System.out.println("Employee added successfully!");
            } 
            else if (choice == 2) {
                System.out.println("\n--- Employee List ---");
                if (count == 0) {
                    System.out.println("No records found.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + employees[i]);
                    }
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
