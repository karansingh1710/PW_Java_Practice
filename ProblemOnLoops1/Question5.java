package ProblemOnLoops1;

import java.util.Scanner;

/*
    Print First N factorial of a number.
    Ex:
    Input: 5
    Output:
    1!=1
    2!=2
    3!=6
    4!=24
    5!=120
*/
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=sc.nextInt();

        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
            System.out.println("Factorial of "+i+" is "+fact);
        }

        sc.close();
        
    }
}
