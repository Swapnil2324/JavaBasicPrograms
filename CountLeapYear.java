import java.util.Scanner;
class CountLeapYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a starting year (YYYY) : ");
        int syear=sc.nextInt();
        System.out.print("Enter a ending year (YYYY) : ");
        int eyear=sc.nextInt();
        int cnt=0;

        System.out.print("Leap years : ");
        for(int i=syear;i<=eyear;i++)
        {
            if(((i%4==0&&i%100!=0))||i%400==0)
            {
                cnt++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Number of leap years between "+syear+" and "+eyear+" : "+cnt);

    }
}