public class FindPairSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int targetSum = 15;
        boolean pairFound = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    pairFound = true;
                    break; 
                }
            }
            
            if (pairFound) {
                break;
            }
        }

        if (!pairFound) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
