import java.util.*;
public class powerNum{
    public static void main(String args[]){
        //Scanner class is used to take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Enter the power:");
        int power=sc.nextInt();
        int result=1;//initializing result variable to store the final result of the power calculation
        for (int i=1;i<=power;i++){
            result=result*n;//calculating the power by multiplying the number with itself
        }
        System.out.println("Result: " + result);//print final result
    }
}