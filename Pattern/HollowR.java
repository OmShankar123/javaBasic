package Pattern;
import java.util.*;
public class HollowR {
    public static void main(String[]  args) {
Scanner sc =new Scanner(System.in);
System.out.print("No.of rows:");
int n=sc.nextInt();
System.out.print("No.of columns:");
int m=sc.nextInt();


for(int i=1;i<=n;i++) { // outer loop for rows
    for(int j=1;j<=m;j++){ // inner loop for columns
         if(i==1|| j==1||i==n||j==m){
            System.out.print("*");
         }
         else{
            System.out.print(" ");
         }

    }
    System.out.println();

}
        
    }
}
