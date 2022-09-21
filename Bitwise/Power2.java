package Bitwise;

import java.util.*;
class Power2{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.");
        int n=sc.nextInt();
        
        int m=n-1;
        if((n&m)==0){
            System.out.println("Number is power of 2.");
        }
        else{
            System.out.println("Number is not power of 2.");
        }

    }

}