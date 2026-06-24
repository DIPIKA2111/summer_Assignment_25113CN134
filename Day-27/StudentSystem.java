import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = new String[100]; // Stores up to 100 student names
        int count = 0; // Keeps track of total students added

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            if (choice == 1) {
                System.out.print("Enter student name: ");
                students[count] = scanner.nextLine();
                count++;
                System.out.println("Student added successfully!");
            } 
            else if (choice == 2) {
                System.out.println("\n--- Student List ---");
                if (count == 0) {
                    System.out.println("No records found.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + students[i]);
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
