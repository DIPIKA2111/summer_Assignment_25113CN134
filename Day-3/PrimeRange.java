import java.util.*;
public class PrimeRange 
{
    public static void main(String args[]) {
        int count=0;
        // TAKE INPUT FROM USER
        Scanner sc=new Scanner(System.in);
        int Min=sc.nextInt();  
        int Max=sc.nextInt();
        
        // CHECKING FOR PRIME NUMBER
        for(int i=Min;i<=Max;i++){
            if(i<2){
               continue;
            }
            for(int j=2;j<i;j++){
                if(i%j==0){
count=1;
break;
                }         
                }  
                if(count==0){
                    // PRINTING PRIME NUMBER
                    System.out.print( i+" ");
                }  
                count=0;       

                }
            }
        }
    
