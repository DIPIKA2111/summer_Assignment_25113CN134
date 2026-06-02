import java.util.*;
public class binaryToDecimal {
    public static void main(String args[]){
        //Scanner class is used to take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary=sc.nextInt();
        int decimal=0;//initializing decimal variable to store the final decimal number
        int power=0; //initializing power variable to keep track of the position of the binary digit
        
        if (binary==0){//if the user enters 0 then the decimal will be 0
            System.out.println("Decimal: 0");
        }
        else if (binary > 0){//if the user enters a positive binary number then the conversion will take place
                while (binary > 0){
                    int rem=binary%10;
                    binary=binary/10;
                     decimal=decimal+rem*(int)Math.pow(2,power++);
                }  
               }                                          
else{//if the user enters a negative number then an error message will be displayed
      System.out.println("Invalid input! Please enter a binary number.");
     }
           System.out.println("Decimal: " + decimal);//printing the decimal number

    
     }
}