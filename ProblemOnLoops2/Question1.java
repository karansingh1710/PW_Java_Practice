package ProblemOnLoops2;
/*
    Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
    Input1:
    6
    Output1:
    1 1 2 3 5 8
    Input2:
    2
    Output2:
    1 1
*/
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N : ");
        int n=sc.nextInt();

        int t1=1,t2=1;

        if(n==1) System.out.print(t1+" ");
        else System.out.print(t1+" "+t2+" ");

        for(int i=3; i<=n; i++){
            int t3=t1+t2;
            t1=t2;
            t2=t3;
            System.out.print(t3+" ");
        }

        System.out.println();

        sc.close();

    }
}
