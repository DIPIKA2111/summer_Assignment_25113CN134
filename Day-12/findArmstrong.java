import java.util.*;
public class findArmstrong {
    public static void armstrong(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            sum += r * r * r;
            temp /= 10;
        }
        if(sum == n){
            System.out.println(n + " is an armstrong number");
        }
        else{
            System.out.println(n+" is not an armstrong number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        armstrong(n);
    }
}