import java.util.*;
public class lowerToUpper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String upperCase = input.toUpperCase();
        System.out.println(upperCase);
        sc.close();
    }
}