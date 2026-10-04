package ProblemOnLoops1;

import java.util.Scanner;

/*
    Reverse the digit of a given number.
    Ex:
    Input: 123
    Output: 321
*/
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        int rev=0;
        while (n!=0) {
            rev=rev*10+(n%10);
            n/=10;
        }

        System.out.println("Reversed Number is "+rev);

        sc.close();
    }
}
