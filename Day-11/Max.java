import java.util.*;
public class Max{
    public static int max(int a,int b ){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int result = max(a, b);
        System.out.println("The maximum number is: " + result);
    }

}