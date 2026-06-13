import java.util.*; 
public class Union {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 3, 6};
        int[] temp = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            temp[count] = array1[i];
            count++;
        }
        for (int i = 0; i < array2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (array2[i] == temp[j]) {
                    isDuplicate = true;
                    break; 
                }
            }

            if (!isDuplicate) {
                temp[count] = array2[i];
                count++;
            }
        }
        int[] unionArray = new int[count];
        for (int i = 0; i < count; i++) {
            unionArray[i] = temp[i];
        }

        // Print the result
        System.out.println("Union Array: " + Arrays.toString(unionArray));
    }
}
