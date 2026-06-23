import java.util.*;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define the questions
        String[] questions = {
            "1. Which programming language is known as 'Write Once, Run Anywhere'?",
            "2. What is the default value of a local variable in Java?",
            "3. Which keyword is used to inherit a class in Java?"
        };
        
        // Define the multiple-choice options for each question
        String[][] options = {
            {"A. C++", "B. Python", "C. Java", "D. Ruby"},
            {"A. null", "B. 0", "C. Depends on data type", "D. No default value"},
            {"A. implements", "B. extends", "C. inherits", "D. imports"}
        };
        
        // Store the correct answer keys (must be uppercase)
        char[] correctAnswers = {'C', 'D', 'B'};
        
        int score = 0;
        int totalQuestions = questions.length;
        
        System.out.println("=== Welcome to the Java Quick Quiz! ===");
        System.out.println("Answer by typing A, B, C, or D.\n");
        
        // Loop through each question
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            
            // Print the options for the current question
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            char userAnswer;
            // Loop until the user provides a valid choice option
            while (true) {
                System.out.print("Your answer: ");
                String input = sc.next().trim().toUpperCase();
                
                if (!input.isEmpty() && (input.charAt(0) >= 'A' && input.charAt(0) <= 'D')) {
                    userAnswer = input.charAt(0);
                    break;
                }
                System.out.println("Invalid choice! Please enter A, B, C, or D.");
            }
            
            // Validate the answer
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + correctAnswers[i] + ".\n");
            }
        }
        
        // Display final score card results
        System.out.println("=== Quiz Finished ===");
        System.out.println("Your Final Score: " + score + " out of " + totalQuestions);
        
        // Calculate and display percentage performance
        double percentage = ((double) score / totalQuestions) * 100;
        System.out.printf("Percentage: %.1f%%\n", percentage);
        
        sc.close();
    }
}
