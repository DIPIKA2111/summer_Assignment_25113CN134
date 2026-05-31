import java.util.*;
public class LCM{
    public static void main(String args[]){
        // TAKE INPUT FROM USER
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        //LOGIC TO FIND LCM
        for(int i=1;i<=x*y;++i){
            if(i%x==0 && i%y==0){
                System.out.println("LCM OF "+x+" and "+y+" is "+i);
                break;
            }
        }
    }
}