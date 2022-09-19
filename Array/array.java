package Array;
import java.util.*;
class array{
public static void main  (String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(str);
    String output="";// declare string
    String finalString = "AEIOUaeiou";
    for(int i=0;i<str.length();i++){
        if(!finalString.contains(str.charAt(i)+"")){// to convert characterb into String we use +""
            output+=str.charAt(i);

        }

    }
    System.out.println(output);
}
}
