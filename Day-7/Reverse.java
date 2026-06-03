import java.util.*;
public class Reverse{
    public static int reverse(int n,int r){
        if(n==0){
            return r;
        }
        else{
            r=r*10+n%10;
            return reverse(n/10,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("Reverse of "+n+" is: "+reverse(n,0));

    }
}