import java.util.Scanner;
class FactorsOfNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}