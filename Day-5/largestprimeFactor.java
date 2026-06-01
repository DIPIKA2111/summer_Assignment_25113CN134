import java.util.*;
public class largestprimeFactor {
    public static void main(String args[]) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //initialize number and largest variable
        int number = n;
        int largest = 0;

        System.out.print("Prime factors: ");
        //find prime factors and largest prime factor
        for (int i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                largest = i;
                number /= i;
            }
        }
        if (number > 1) {
            System.out.print(number + " ");
            largest = number;
        }

        System.out.println();
        System.out.println("Largest prime factor is: " + largest);
    }
}
