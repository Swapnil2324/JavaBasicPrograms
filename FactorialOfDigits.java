//FACTORIAL OF EACH DIGITS USING METHODS 
import java.util.Scanner;

class FactorialOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        while(num>0)
        {
            int rem=num%10;
            factorial(rem);
            num/=10;
        }
    }
    public static void factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("factorial of "+num+" is "+fact);
    }
}