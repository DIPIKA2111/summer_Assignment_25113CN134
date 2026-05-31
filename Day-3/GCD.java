import java.util.*;
public class GCD{
    public static void main(String args[]){
//take input 

Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();

//logic to find GCD
int gcd=1;
for( int i=1;i<=x && i<=y; ++i){
    if(x % i == 0 && y % i == 0){
        gcd=i;
    }
}
System.out.println("GCD OF " + x +" and "+  y +" is "+ gcd);
    }
        
    
}