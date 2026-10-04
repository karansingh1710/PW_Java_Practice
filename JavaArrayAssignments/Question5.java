package JavaArrayAssignments;

import java.util.Scanner;

/*
    Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
    Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
    Leftmost and rightmost element cannot be a peak element.
    Output:
    4
*/
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        if(n<3){
            System.out.println("There is no peak element is present inside the array.");
        }

        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("First peak element of the array is "+arr[i]);
                break;
            }
        }
    }
}
