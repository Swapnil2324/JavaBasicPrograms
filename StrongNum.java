import java.util.Scanner;

class StrongNum
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
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact*=i;
            }
            num/=10;
            sum+=fact;
        }
        if(sum==dup)
            System.out.println(dup+" is a Strong  Number.");
        else
            System.out.println(dup+" is not a Strong Number");
        
    }
}