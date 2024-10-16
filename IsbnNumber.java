import java.util.Scanner;
class IsbnNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long num=sc.nextLong();
        long num1=num;
        int pos=1;
        int sum=0;
        while(num>0)
        {
            long rem=num%10;
            sum+=(rem*pos++);
            num/=10;
        }
        System.out.println(((sum%11)==0)?(num1+" is valid ISBN Number."):(num1+" is invalid ISBN Number."));
    }
}