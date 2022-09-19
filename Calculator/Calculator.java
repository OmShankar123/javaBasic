package Calculator;
import java.util.*;

public class Calculator {
   
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number");
        int a=sc.nextInt();
        System.out.println("Second number");
        int b=sc.nextInt();
        System.out.println("what you want to do 1:add,2:Sub,3:Mul,4:Div");
        int c=sc.nextInt();
    

switch(c){
    case 1:System.out.println(a+b);
    break;
    case 2:System.out.println(a-b);
    break;
    case 3:System.out.println(a*b);
    break;
    case 4:System.out.println(a/b);
    break;
    default:System.out.println("Invalid input");
}

        
    }
    
}
