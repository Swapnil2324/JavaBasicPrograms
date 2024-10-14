
// IF SUM OF THE FACTORIAL OF ITS DIGIT IS EQUAL TO NUMBER ITSELF :: STRONG NUMBER

import java.util.Scanner;
class StrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int num=sc.nextInt();
        int dup=num;
        int sum=0;

        while(num>0)
        {
            int rem=num%10;
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        
        if(sum==dup)
        {
            System.out.println(dup+" is a Strong Number.");
        }else{
            System.out.println(dup+" is not a Strong Number.");
        }
    }
}