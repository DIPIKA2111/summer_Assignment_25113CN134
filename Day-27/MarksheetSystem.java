import java.util.Scanner;

public class MarksheetSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Subject list
        String[] subjects = {"Math", "Science", "English", "History", "Computer"};
        int[] marks = new int[5];

        System.out.println("--- MARKSHEET GENERATION SYSTEM ---");
        
        // 1. Input Student Information
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNum = scanner.nextLine();

        // 2. Input Marks for each subject
        System.out.println("\nEnter marks obtained (out of 100):");
        int totalMarks = 0;
        boolean failedAnySubject = false;

        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];

            // Check if student failed a specific subject (passing score: 40)
            if (marks[i] < 40) {
                failedAnySubject = true;
            }
        }

        // 3. Calculate Percentage and Grade
        double percentage = (double) totalMarks / subjects.length;
        String grade;

        if (failedAnySubject) {
            grade = "F (Fail)";
        } else if (percentage >= 85) {
            grade = "A+ (Excellent)";
        } else if (percentage >= 70) {
            grade = "A (Very Good)";
        } else if (percentage >= 55) {
            grade = "B (Good)";
        } else if (percentage >= 40) {
            grade = "C (Pass)";
        } else {
            grade = "F (Fail)";
        }

        // 4. Print the final report card / marksheet
        System.out.println("\n========================================");
        System.out.println("              STUDENT MARKSHEET          ");
        System.out.println("========================================");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("----------------------------------------");
        System.out.println("Subject       | Max Marks | Obtained");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < subjects.length; i++) {
            // Formats spacing to look like a clean table
            System.out.printf("%-13s | 100       | %d\n", subjects[i], marks[i]);
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Total Marks: " + totalMarks + " / " + (subjects.length * 100));
        System.out.printf("Percentage:  %.2f%%\n", percentage);
        System.out.println("Final Grade: " + grade);
        System.out.println("========================================");

        scanner.close();
    }
}
