import java.util.*;
public class arraySum {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        int sum = 0; 
        
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i]; 
        }
            float  average = (float) sum / size;

            System.out.println(" Results ");
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        
    }
}