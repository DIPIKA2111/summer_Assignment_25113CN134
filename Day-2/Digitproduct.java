import java.util.*;
public class Digitproduct {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int product=1;
        while(n>0){
            int digit=n%10;
            product=product*digit;
            n=n/10; 
        }
        System.out.println("The product of digits is:"+product);
    }
}