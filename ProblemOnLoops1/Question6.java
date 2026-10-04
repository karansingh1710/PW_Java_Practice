package ProblemOnLoops1;

import java.util.Scanner;

/*
    Given 2 numbers a and b. Find a raise to the power b
    Ex:
    Input: a=2, b=5;
    Output: 32
*/
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A and B respectively.");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ans=1;

        for(int i=1; i<=b; i++){
            ans*=a;
        }
        System.out.println(a+" raise to the power "+b+" is "+ans);
        sc.close();
    }
}
