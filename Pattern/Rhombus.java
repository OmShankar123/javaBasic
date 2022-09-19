package Pattern;
import java.util.*;
public class Rhombus {
   public static void main(String[] args){
System.out.print("Number of rows:");
Scanner sc= new Scanner(System.in);
int n =sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for( int j=1;j<=n;j++){
    System.out.print("*");
    }
    System.out.println();
}

   } 
}
