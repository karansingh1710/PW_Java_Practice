package ProblemOnLoops1;

import java.util.Scanner;

/*
    Find the sum of digits of given number.
    Ex:-
    Input: 12345
    Output: 15 // 1+2+3+4+5=15
*/
public class Question2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of your choice : ");
        int n=sc.nextInt();
        int sum=0;

        while(n!=0){
            sum+=(n%10);
            n/=10;
        }

        System.out.println("Sum of given number is : "+sum);
        sc.close();
    }
}
