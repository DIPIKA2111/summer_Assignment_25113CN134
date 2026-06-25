import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Fixed arrays to store up to 5 books
        String[] bookTitles = {"Effective Java", "Clean Code", "Head First Java", "", ""};
        String[] bookAuthors = {"Joshua Bloch", "Robert Martin", "Kathy Sierra", "", ""};
        boolean[] isIssued = {false, false, false, false, false}; // false = available, true = borrowed
        
        int bookCount = 3; // Starting with 3 pre-loaded books

        while (true) {
            System.out.println("\n--- Easy Library System ---");
            System.out.println("1. View All Books");
            System.out.println("2. Add a New Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            if (choice == 1) {
                // 1. View Books
                System.out.println("\n--- Library Books ---");
                for (int i = 0; i < bookCount; i++) {
                    String status = isIssued[i] ? "Borrowed" : "Available";
                    System.out.println((i + 1) + ". " + bookTitles[i] + " by " + bookAuthors[i] + " [" + status + "]");
                }
            } 
            else if (choice == 2) {
                // 2. Add Book
                if (bookCount >= 5) {
                    System.out.println("Library storage is full!");
                } else {
                    System.out.print("Enter book title: ");
                    bookTitles[bookCount] = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    bookAuthors[bookCount] = scanner.nextLine();
                    isIssued[bookCount] = false; // New book is available
                    bookCount++;
                    System.out.println("Book added successfully!");
                }
            } 
            else if (choice == 3) {
                // 3. Borrow Book
                System.out.print("Enter book number to borrow: ");
                int index = scanner.nextInt() - 1;
                
                if (index >= 0 && index < bookCount) {
                    if (isIssued[index]) {
                        System.out.println("Sorry, this book is already borrowed.");
                    } else {
                        isIssued[index] = true;
                        System.out.println("Success! You borrowed: " + bookTitles[index]);
                    }
                } else {
                    System.out.println("Invalid book number.");
                }
            } 
            else if (choice == 4) {
                // 4. Return Book
                System.out.print("Enter book number to return: ");
                int index = scanner.nextInt() - 1;
                
                if (index >= 0 && index < bookCount) {
                    if (!isIssued[index]) {
                        System.out.println("This book was not borrowed.");
                    } else {
                        isIssued[index] = false;
                        System.out.println("Success! You returned: " + bookTitles[index]);
                    }
                } else {
                    System.out.println("Invalid book number.");
                }
            } 
            else if (choice == 5) {
                // 5. Exit
                System.out.println("Goodbye!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }
}
