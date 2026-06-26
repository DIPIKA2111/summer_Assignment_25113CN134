import java.util.Scanner;

public class ArrayOperationsSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial setup for the dynamic array
        System.out.print("Enter the maximum capacity of the array: ");
        int capacity = scanner.nextInt();
        int[] arr = new int[capacity];
        int size = 0; // Tracks the actual number of active elements in the array
        
        int choice;

        do {
            // Display system menu
            System.out.println("\n=================================");
            System.out.println("     ARRAY OPERATIONS SYSTEM     ");
            System.out.println("=================================");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element (Linear Search)");
            System.out.println("4. Traverse / Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // INSERTION
                    if (size >= capacity) {
                        System.out.println("Error: Array is full overflow condition reached.");
                        break;
                    }
                    System.out.print("Enter the element to insert: ");
                    int elementToInsert = scanner.nextInt();
                    System.out.print("Enter position (0 to " + size + "): ");
                    int insertPos = scanner.nextInt();

                    if (insertPos < 0 || insertPos > size) {
                        System.out.println("Invalid position!");
                    } else {
                        // Shift elements to the right to create space
                        for (int i = size - 1; i >= insertPos; i--) {
                            arr[i + 1] = arr[i];
                        }
                        arr[insertPos] = elementToInsert;
                        size++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 2: // DELETION
                    if (size == 0) {
                        System.out.println("Error: Array is empty underflow condition reached.");
                        break;
                    }
                    System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
                    int deletePos = scanner.nextInt();

                    if (deletePos < 0 || deletePos >= size) {
                        System.out.println("Invalid position!");
                    } else {
                        int removedElement = arr[deletePos];
                        // Shift elements to the left to close the gap
                        for (int i = deletePos; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        size--;
                        System.out.println("Element " + removedElement + " deleted successfully.");
                    }
                    break;

                case 3: // SEARCHING
                    if (size == 0) {
                        System.out.println("Array is empty. Nothing to search.");
                        break;
                    }
                    System.out.print("Enter element to search for: ");
                    int target = scanner.nextInt();
                    int foundIndex = -1;

                    // Linear search loop
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == target) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Element found at index: " + foundIndex);
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 4: // TRAVERSAL
                    if (size == 0) {
                        System.out.println("Array is empty: []");
                    } else {
                        System.out.print("Current Array: [");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i]);
                            if (i < size - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                    }
                    break;

                case 5: // EXIT
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid entry! Choose an option between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
