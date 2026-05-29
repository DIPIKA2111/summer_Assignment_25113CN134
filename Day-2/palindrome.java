import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original = n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}