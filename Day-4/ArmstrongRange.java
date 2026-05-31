import java.util.*;
public class ArmstrongRange{
    public static void main(String args[]){ 

        // input from user
        Scanner sc=new Scanner(System.in);
        int Min=sc.nextInt();
        int Max=sc.nextInt();

        // loop to check for Armstrong numbers in the given range
        for(int i=Min;i<=Max;i++){
            int num=i;
            int originalNum=num;
            int result=0;
            // loop to calculate the sum of cubes of digits
            while(num>0){
                int rem=num%10;
                result+=Math.pow(rem,3);
                num=num/10;
            }
            // check if the result is equal to the original number
            if(result==originalNum){
                // print the Armstrong number
                System.out.print(i+"  ");
            }
        }
    }
}