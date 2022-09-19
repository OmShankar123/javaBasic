package Pattern;
import java.util.*;
public class palindromic {
    public static void main(String[] args){
        int counter=1;
        System.out.print("Number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
                
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
