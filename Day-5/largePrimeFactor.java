import java.util.*;
public class largePrimeFactor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextLong();
        long original = n;
        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        if (n > 2) {
            maxPrime = n;
        }

        if (original <= 1) {
            System.out.println("No prime factors for " + original);
        } else {
            System.out.println("The largest prime factor is: " + maxPrime);
        }
    }
}
