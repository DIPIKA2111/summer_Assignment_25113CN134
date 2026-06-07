import java.util.*;
public class sum {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("The sum is: " + sum(a, b));
    }
}