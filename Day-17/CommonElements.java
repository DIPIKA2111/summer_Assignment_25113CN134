import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 3};
        int[] array2 = {2, 3, 5, 3, 6};

       
        ArrayList<Integer> commonList = new ArrayList<>();

        
        for (int i = 0; i < array1.length; i++) {
            
            
            for (int j = 0; j < array2.length; j++) {
                
                
                if (array1[i] == array2[j] && !commonList.contains(array1[i])) {
                    commonList.add(array1[i]);
                    break; 
                }
            }
        }

        // Print the result
        System.out.println("Common Elements: " + commonList);
    }
}
