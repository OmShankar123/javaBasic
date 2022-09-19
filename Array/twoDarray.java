package Array;
import java.util.*;

 class twoDarray {

    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int twoDarray [][]= new int[4][5];
        int i,j,k=0;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){

                twoDarray[i][j]=sc.nextInt();
                
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(twoDarray[i][j]);
            }
            System.out.println();
        }

    }
    
}
