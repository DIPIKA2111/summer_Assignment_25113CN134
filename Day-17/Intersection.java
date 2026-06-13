import java.util.*; 

public class Intersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {2, 3, 6, 7};
        int maxSize = Math.min(array1.length, array2.length);
        int[] temp = new int[maxSize];
        int count = 0;

       
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                
                
                if (array1[i] == array2[j]) {
                    
                   
                    boolean alreadyAdded = false;
                    for (int k = 0; k < count; k++) {
                        if (temp[k] == array1[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }

                  
                    if (!alreadyAdded) {
                        temp[count] = array1[i];
                        count++;
                    }
                    
                    break; 
                }
            }
        }
        int[] intersectionArray = new int[count];
        for (int i = 0; i < count; i++) {
            intersectionArray[i] = temp[i];
        }

        // Print the result
        System.out.println("Intersection Array: " + Arrays.toString(intersectionArray));
    }
}