import java.util.Scanner;
class SquareRoot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        for (int i=2;i<=num/2;i++)
        {
            int op=i*i;
            if(op==num)
            {
                System.out.println("Square root of "+ num+" is "+i);
                break;
            }
            else if(op>num){
                System.out.println(num+" not have perfect Square root.");
                break;
            }

        }

    }
}