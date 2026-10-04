package ProblemOnLoops1;

import java.util.Scanner;

/*
    Sum of given number in given series. Add Odd number and subtract Even number.
    Ex:
    Input: 5
    Output: 1-2+3-4+5=3
*/
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=sc.nextInt();

        int ans=0;

        for(int i=1; i<=n; i++){
            if(i%2!=0) ans+=i;
            else ans-=i;
        }

        System.out.println("Answer : "+ans);
        sc.close();
    }
}
