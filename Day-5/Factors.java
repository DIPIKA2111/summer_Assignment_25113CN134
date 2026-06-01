import java.util.*;
public class Factors{
    public static void main(String args[]){
        //take input from user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //find factors of n and print them
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
