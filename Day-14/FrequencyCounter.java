public class FrequencyCounter {

    public static void countFrequencies(int[] arr) {
        int n = arr.length;
        
        
        boolean[] visited = new boolean[n];

        System.out.println("Element | Frequency");

        
        for (int i = 0; i < n; i++) {
            
            
            if (visited[i]) {
                continue;
            }

            
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; 
                    count++;
                }
            }

        
            System.out.println("   " + arr[i] + "    |    " + count);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        
        countFrequencies(numbers);
    }
}