import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // initialise the first two numbers of the sequence
        int n1=0;
        int n2=1;

        // input from user how many numbers of the sequence to print
        int n=sc.nextInt();
        
        // loop to print the sequence
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}