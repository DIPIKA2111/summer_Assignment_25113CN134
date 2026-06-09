import java.util.*;

public class Array {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        
        int numbers[] = new int[size];
        

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        
        
        System.out.println("The array elements are:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i] + " ");}
    }
}
