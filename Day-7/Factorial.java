import java.util.*;
public class Factorial {

    // Recursive method to calculate factorial
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String args []) {
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
        int result = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is: " + result);
    }
}