// a number is buzz number if it divisible by 7 or its unit place digit is 7
import java.util.Scanner;
class BuzzNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        if (num%10==7 || num%7==0)
        {
            System.out.println(num+" is a Buzz Number.");
        }else{
            System.out.println(num+" is not a Buzz Number." );
        }
    }
}