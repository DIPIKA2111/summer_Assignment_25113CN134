import java.util.*;
public class perfectNum {
    public static void main(String args[]){
        //take input from user
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //find factors of n and add them
    int sum=1;
    if(n==1){
        System.out.println("Not a perfect number");
    }
    for(int i=2;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
    }
    //check if sum of factors is equal to n
    if(sum==n){
        System.out.println("Perfect number");
    }
    else{
        System.out.println("Not a perfect number");
    }
}   
}   
