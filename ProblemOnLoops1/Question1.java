package ProblemOnLoops1;

import java.util.Scanner;

/**
 * Count the  number of digits for a given number.
 * Ex:
 * Input: 12345
 * Output: 5
 */
public class Question1 {
    public static void main(String[] args){
        Scanner  sc=new  Scanner(System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();

        int count=0;
        if(n==0) count=1;
        while(n!=0){
            n/=10;
            count++;
        }

        System.out.println("Total Digit in the given number is "+count);
        sc.close();
    }
}
