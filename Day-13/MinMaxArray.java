import java.util.*;

public class MinMaxArray {
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
        
        int largest = numbers[0];
        int smallest = numbers[0];
        
    
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; 
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i]; 
        }
    }
        
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
        
    
}
}
