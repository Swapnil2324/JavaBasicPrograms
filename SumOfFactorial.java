//SUM OF FACTORIAL OF EACH DIGITS USING METHODS 
import java.util.Scanner;

class SumOfFactorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int sum=0;

        while(num>0)
        {
            int rem=num%10;
            int a=factorial(rem);
            sum+=a;
            num/=10;
        }
        System.out.print("Sum of factorial of digits is "+sum);
    }
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }
}