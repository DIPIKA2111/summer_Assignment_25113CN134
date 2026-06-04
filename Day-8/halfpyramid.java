import java.util.*;
public class halfpyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");//take input for no. of rows
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {//outer loop for rows
            for (int j = 1; j <= i; j++) {//inner loop for columns
                System.out.print("* ");//print star
            }
            System.out.println();//move to next line after each row
        }
        
    }
}