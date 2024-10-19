import java.util.Scanner;
class EmripNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        boolean flag=Prime(num);
        if (flag)
        {
            int rev=reverse(num);
            flag=Prime(rev);
            if (flag)
            {
                System.out.println(num+" is Emrip Number ");
            }
            else{
                System.out.println(num+" is not a Emrip Number ");
            }
            
        }else{
            System.out.println(num+" is not a Emrip Number.");
        }
    }
    public static boolean Prime(int num)
    {
        
        boolean flag=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            return true;
        }else{
           return false;
        }
    }
    public static int reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        return rev;
    }
}