import java.util.*;
public class countSetbits {
    public static void main(String args[]){
        //Scanner class is used to take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        int count=0;//initializing count variable to store the number of set bits

        while (n>0){
            count+=(n&1);//if the last bit is 1 then count will be incremented by 1
            n>>=1;//right shift the number by 1 to check the next bit
        }
        
        System.out.println("Number of set bits: " + count);
    }
}