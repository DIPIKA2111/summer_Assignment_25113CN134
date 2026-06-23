import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number from 1 to 10
        int targetNumber = random.nextInt(10) + 1;
        int guess = 0;
        
        System.out.println("Guess a number between 1 and 10!");

        // Loop until the user guesses correctly
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You win!");
            }
        }
        
        scanner.close();
    }
}
