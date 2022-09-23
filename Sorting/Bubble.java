package Sorting;
import java.util.*;
public class Bubble {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int sumMin=0;
        int sumMax=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }
    
        System.out.println("Entered array is:"); 
    for(int i=0;i<n;i++){

    System.out.print(arr[i]+" ");
    // 

    }
    System.out.println();
    System.out.println("Length of the array:"+arr.length);
     for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

            }
        }  
        

    }
    System.out.println("Array after sorting:");
    for(int i=0;i<arr.length;i++){
   System.out.print(arr[i]+" ");
    }
    System.out.println();
    
        System.out.println("Second largest number:"+arr[arr.length-2]);
        for(int i=0;i<4;i++){
            sumMin+=arr[i];
        }
        System.out.println("Minimum sum of 4 number :"+sumMin);
        for(int i=arr.length-1;i>arr.length-5;i--){
            sumMax+=arr[i];

        }
        System.out.println("Maximum Sum of 4 number :"+sumMax);
}
}
