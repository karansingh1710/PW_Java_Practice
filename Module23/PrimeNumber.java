import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number to check whether it's prime or not ");
        int n=sc.nextInt();

        boolean flag=true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}