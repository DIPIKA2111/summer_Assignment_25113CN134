import java.util.*;
public class Armstrong{
    public static void main(String args[]){

        // input from user
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();

        // store the original number in a variable
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
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}