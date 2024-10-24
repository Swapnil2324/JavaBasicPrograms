// if a number is divisible by sum of its digits then the number is known as harshad number.
import java.util.Scanner;
class HarshadNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int dup=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        
        if(dup%sum==0)
        {
            System.out.println(dup+" is a Harshad Number." );
        }else{
            System.out.println(dup+" is not a Harshad Number." );
        }
    }
}