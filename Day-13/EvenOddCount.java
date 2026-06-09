import java.util.*;

public class EvenOddCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = sc.nextInt();
            
            
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
      
        System.out.println("Total Even elements: " + evenCount);
        System.out.println("Total Odd elements: " + oddCount);
        
        
    }
}

