// COUNT OF FACTORS OF A NUMBER

import java.util.Scanner;
class CntFactors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int cnt=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
                cnt++;
        }
        System.out.println("Count of factors of "+num+ " is "+cnt);
    }
}