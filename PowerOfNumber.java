import java.util.Scanner;
class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        System.out.print("Enter a power Number : ");
        int pow=sc.nextInt();
        int power=pow;
        int op=1;

        while(pow>0)
        {
            op*=num;
            pow--;
        }
        System.out.println(num+" to power "+power+" is "+op);
    }
}