import java.util.Scanner;

public class SalarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Parallel arrays to store basic data for up to 50 employees
        String[] names = new String[50];
        double[] baseSalaries = new double[50];
        double[] netSalaries = new double[50];
        int count = 0;

        while (true) {
            System.out.println("\n--- SALARY MANAGEMENT SYSTEM ---");
            System.out.println("1. Calculate & Add Salary");
            System.out.println("2. View Payroll Summary");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            if (choice == 1) {
                System.out.print("Enter Employee Name: ");
                names[count] = scanner.nextLine();

                System.out.print("Enter Monthly Base Salary: $");
                baseSalaries[count] = scanner.nextDouble();

                // Simple salary breakdown formulas
                double bonus = baseSalaries[count] * 0.10;  // 10% Allowances / Bonus
                double tax = baseSalaries[count] * 0.12;    // 12% Tax Deduction
                
                // Net Salary = Base + Bonus - Tax
                netSalaries[count] = baseSalaries[count] + bonus - tax;
                
                count++;
                System.out.println("Salary processed successfully!");

            } else if (choice == 2) {
                System.out.println("\n--- PAYROLL SUMMARY REPORT ---");
                if (count == 0) {
                    System.out.println("No payroll data generated yet.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println("Employee: " + names[i]);
                        System.out.println("  Base Salary: $" + baseSalaries[i]);
                        System.out.println("  Net Payout:  $" + netSalaries[i]);
                        System.out.println("-----------------------------");
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting Payroll System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid selection. Try again.");
            }
        }
        scanner.close();
    }
}
