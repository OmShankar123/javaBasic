package Pattern;
import java.util.*;
public class Butterfly {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=sc.nextInt();
        for( int i=1;i<=n;i++){
            //Upper half
            for(int j=1;j<=i;j++){
          System.out.print("*"); 
            } 
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
           
    }
   
    // Lower half
    for( int i=n;i>=1;i--){
        //Upper half
        for(int j=1;j<=i;j++){
      System.out.print("*"); 
        } 
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       
}
}
}
