import java.util.Scanner;
class PrimeInRange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a starting number : ");
        int snum=sc.nextInt();
        System.out.print("Enter a ending number : ");
        int endno=sc.nextInt();

        for(int i=snum;i<=endno;i++)
        {
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(i+" ");
            }

        
        }
    }
}