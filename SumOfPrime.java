// SUM OF PRIME DIGITS PRESENT IN A NUMBER
import java.util.Scanner;

class SumOfPrime
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
            boolean flag=true;
            if(rem>1)
            {
                for(int i=2;i<rem;i++)
                {
                    if(rem%i==0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            else{
                flag=false;
            }

            if(flag)
            {
                sum+=rem;
            }

            num/=10;
        }
        System.out.println("Sum of Prime number is : "+sum);
    }
}