import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define inventory boundaries
        int maxItems = 50;
        String[] itemNames = new String[maxItems];
        int[] itemQuantities = new int[maxItems];
        double[] itemPrices = new double[maxItems];
        int itemCount = 0; // Tracks the total number of unique items added
        
        int choice;

        do {
            // Display system options
            System.out.println("\n--- INVENTORY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add New Item");
            System.out.println("2. View All Items");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. Check Low Stock Alert");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input memory buffer

            switch (choice) {
                case 1: // ADD NEW ITEM
                    if (itemCount >= maxItems) {
                        System.out.println("Inventory is full! Cannot add more items.");
                        break;
                    }
                    System.out.print("Enter item name: ");
                    itemNames[itemCount] = scanner.nextLine();
                    
                    System.out.print("Enter quantity: ");
                    itemQuantities[itemCount] = scanner.nextInt();
                    
                    System.out.print("Enter price per unit: ");
                    itemPrices[itemCount] = scanner.nextDouble();
                    
                    itemCount++;
                    System.out.println("Item added successfully!");
                    break;

                case 2: // VIEW ALL ITEMS
                    if (itemCount == 0) {
                        System.out.println("Inventory is completely empty.");
                        break;
                    }
                    System.out.println("\n--- CURRENT STOCK ---");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.printf("Name: %s | Qty: %d | Price: $%.2f\n", 
                                itemNames[i], itemQuantities[i], itemPrices[i]);
                    }
                    break;

                case 3: // UPDATE QUANTITY
                    if (itemCount == 0) {
                        System.out.println("No items available to update.");
                        break;
                    }
                    System.out.print("Enter item name to update: ");
                    String searchName = scanner.nextLine();
                    int foundIndex = -1;

                    // Search for the item
                    for (int i = 0; i < itemCount; i++) {
                        if (itemNames[i].equalsIgnoreCase(searchName)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.print("Enter new quantity: ");
                        itemQuantities[foundIndex] = scanner.nextInt();
                        System.out.println("Stock quantity updated successfully!");
                    } else {
                        System.out.println("Item not found in inventory.");
                    }
                    break;

                case 4: // LOW STOCK CHECK
                    if (itemCount == 0) {
                        System.out.println("No items to check.");
                        break;
                    }
                    System.out.println("\n--- LOW STOCK WARNING (Less than 5 items) ---");
                    boolean lowStockFound = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (itemQuantities[i] < 5) {
                            System.out.println(itemNames[i] + " is running low! Current Qty: " + itemQuantities[i]);
                            lowStockFound = true;
                        }
                    }
                    if (!lowStockFound) {
                        System.out.println("All item stock levels are healthy.");
                    }
                    break;

                case 5: // EXIT
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
