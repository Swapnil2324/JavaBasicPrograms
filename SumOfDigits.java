import java.util.Scanner;
class SumOFDigits
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
        System.out.println("Sum of Digits of "+dup+" is "+sum);
    }
}