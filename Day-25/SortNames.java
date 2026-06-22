import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        // Create an array of names
        String[] names = {"Rahul", "Amit", "Zayn", "Priya", "Divya"};

        System.out.println("Original Names: " + Arrays.toString(names));

        // Sort the array alphabetically
        Arrays.sort(names);

        // Print the sorted result
        System.out.println("Sorted Names:   " + Arrays.toString(names));
    }
}
