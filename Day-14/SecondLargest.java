public class SecondLargest {

    
    public static int findSecondLargest(int[] arr) {
        
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return Integer.MIN_VALUE;
        }

    
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            
            if (num > largest) {
                secondLargest = largest; 
                largest = num;   }      
            else if (num > secondLargest && num != largest) {
                secondLargest = num;     
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        
        int[] numbers1 = {12, 35, 1, 10, 34, 1};
        int result1 = findSecondLargest(numbers1);
        System.out.println("The second largest element is: " + result1); 

        
    }
}
