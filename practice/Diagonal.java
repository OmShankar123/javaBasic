package practice;
import java.util.*;
public class Diagonal {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
 


for(int i=1;i<n;i++){
    for(int j=0;j<=i;j++){
        {
            if(i==j){
                System.out.print(i);
                }
                else
                System.out.print(" ");
        //System.out.print("1");
        }
    }

    for(int k=1;k<=2*n-2*i;k++){
        if(k==2*n-2*i)
        System.out.print(i);
        else
        System.out.print(" ");
    }
    System.out.println();
}
   

    for(int i=n;i>0;i--){
        for(int j=0;j<=i;j++){
            {
                if(i==j){
                    System.out.print(i);
                    }
                    else
                    System.out.print(" ");
            //System.out.print("1");
            }
        }
    
        for(int k=1;k<=2*n-2*i;k++){
            if(k==2*n-2*i)
            System.out.print(i);
            else
            System.out.print(" ");
        }
        System.out.println();
    }
       
}
    }
   
    

