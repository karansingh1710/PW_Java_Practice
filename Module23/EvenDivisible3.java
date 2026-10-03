import java.util.Scanner;

public class EvenDivisible3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        if(num%2==0 && num%3==0){
            System.out.println("The given number is even and divisible by 3");
        }else{
            System.out.println("The given number is either not even or not divisible by 3");
        }
        sc.close();
    }
}