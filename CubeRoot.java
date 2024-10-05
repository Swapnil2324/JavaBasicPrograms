import java.util.Scanner;
class CubeRoot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        for (int i=2;i<=num/2;i++)
        {
            int op=i*i*i;
            if(op==num)
            {
                System.out.println("Cube root of "+ num+" is "+i);
                break;
            }
            else if(op>num){
                System.out.println(num+" not have perfect Cube root.");
                break;
            }
        }

    }
}