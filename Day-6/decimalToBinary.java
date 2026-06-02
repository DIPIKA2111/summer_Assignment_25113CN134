import java.util.*;
public class decimalToBinary {
    public static void main(String args[]){
        //Scanner class is used to take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int decimal=sc.nextInt();
        String binary=" ";//String is used to store binary number in sequence not in reverse order

        if(decimal==0){//if the user enters 0 then the binary will be 0
            System.out.println("Binary: 0");
        }
        else{
            while(decimal>0){//while loop is used to convert decimal to binary until the decimal becomes 0

                int remainder=decimal%2;   
                decimal=decimal/2;
                binary=remainder+binary;

            }
            System.out.println("Binary: " + binary);//printing the binary number
        
        }
    }
}