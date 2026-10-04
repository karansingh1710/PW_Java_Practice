package JavaArrayAssignments;
import java.util.*;
/*
Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
Output:
    2
    6
    0
    4
*/
public class Question1 {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the size of the array elements.");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the elements of array");
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }

    // we have to print only the positive elements of the array

    System.out.println("Positive elements of the array : ");

    for(int i: arr){
        if(i>=0){
            System.out.println(i);
        }
    }

    sc.close();
   }
}
