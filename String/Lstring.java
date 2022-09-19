package String;
import java.util.*;

 class Lstring {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String stri="";
        int n=sc.nextInt();
        String str []=new String [n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(int i=0;i<n;i++){
             stri+=str[i];
        System.out.println(stri);
        }
        System.out.println(stri.length());
    }
    
}
