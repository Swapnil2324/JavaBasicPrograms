import java.util.Scanner;
class SpyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int dup=num;
        int prod=1;
        int sum=0;

        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            prod*=rem;
            num/=10;
        }
        if(prod==sum)
            System.out.println(dup+" is a Spy Number.");
        else
            System.out.println(dup+" is not a Spy Number.");
    }
}