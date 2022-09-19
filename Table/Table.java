package Table;

import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number whose table you want: ");
        int n=sc.nextInt();
        System.out.printf("The table of %d is given below:\n",n);
        for(int i=1;i<=10;i++){
            
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }
    }
    
}
