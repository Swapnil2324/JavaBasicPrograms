import java.util.Scanner;
class NeonNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int dup=num;
        int sum=0;
        int sqrt=num*num;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(sum==dup)
            System.out.println(dup+" is Neon Number.");
        else
            System.out.println(dup+" is not Neon Number.");
    }
}