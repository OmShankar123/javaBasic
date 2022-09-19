package Pattern;

import java.util.*;
public class Traingle{
    public static void main(String[] args) {
        System.out.println("No. of rows");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    for(int i=1;i<=n;i++) {//outer loop for rows

        for(int j=1;j<=i;j++){// inner loop for columns
            System.out.print(j+" ");

        }
        System.out.println();// for next line

    }
        
    }
}