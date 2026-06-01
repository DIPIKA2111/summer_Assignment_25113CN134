import java.util.*;
public class StrongNum {
    public static void main(String args[]){
        //take input from user
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //initialize sum to 0 and store original equal to n
        int sum=0;
        int original=n;
        //find factorial of each digit and add them
        while(n>0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;

    }
            sum+=fact;
            n/=10;
        }
        //check if sum of factorial of digits is equal to original number
        if(sum==original){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }

}
