package Pattern;
import java.util.*;
public class Pyramid{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Pyaramid length:");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
           // for(int j=n-i+1;j<=n;j++){// OR
            for(int j=1;j<=i;j++){
            System.out.print(i+" ");
            //System.out.print(j+" ");
           
            }
            System.out.println();
        }
        
    }
}

