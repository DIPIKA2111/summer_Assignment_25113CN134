import java.util.*;
public class prime {
    public static String checkprime(int a) {
        if(a<=1){
        return "Not a prime number";
        }
        else if(a==2){
            return "Prime number";
        }
        else if(a%2==0){
            return "Not a prime number";
        }
        else if (a>2){
            for(int i=3;i<=Math.sqrt(a);i+=2 ){
                if(a%i==0){
                    return "Not a prime number";
                }
            }
            return "Prime number";
        }
        else{
            return "Not a prime number";
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println(checkprime(a));
    }
}