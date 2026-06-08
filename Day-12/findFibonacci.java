import java.util.*;
public class findFibonacci {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n = sc.nextInt();
        fibonacci(n);
    }
}