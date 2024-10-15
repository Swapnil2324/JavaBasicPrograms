import java.util.Scanner;
class SunnyNumber
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int num1=num+1;
        int sqrt=0;

        for(int i=1;i<=(num/2);i++)
        {
            int prod=i*i;
            if(prod==num1)
            {
                sqrt=prod;
                break;
            }
            if(prod>num)
            {
                break;
            }
        }
        if(sqrt==num1)
            System.out.println(num+" is a Sunny Number.");
        else
            System.out.println(num+" is not a Sunny Number.");
    }
}