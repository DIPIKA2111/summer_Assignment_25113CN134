import java.util.*;
public class findPalindrome {
    public static void palindrome(int i){
        int original = i;
        int rev = 0;

        while(i != 0){
            int rem = i % 10;
            rev = rev * 10 + rem;
            i = i / 10;
        }

        if(rev == original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        palindrome(i);
    }
}
