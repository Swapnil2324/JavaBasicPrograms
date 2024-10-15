import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int dup=num;
        int dup1=num;

        int sum=0;
        int cnt=0;
        while(num>0)
        {
            cnt++;
            num/=10;
        }
        while(dup>0)
        {
            int rem=dup%10;
            int fact=1;
            for(int i=1;i<=cnt;i++)
            {
                fact*=rem;
            }
            sum+=fact;
            dup/=10;
        }
        if(sum==dup1)
            System.out.println(dup1+" is a Armstrong Number.");
        else
            System.out.println(dup1+" is not a Armstrong Number.");
    }
}