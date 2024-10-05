import java.util.Scanner;

class SumOfEvenOddDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int EvenSum=0;
        int OddSum=0;

        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                EvenSum+=rem;
            }
            else{
                OddSum+=rem;
            }
            num/=10;
        }
        System.out.println("Sum of even digit is :"+EvenSum);
        System.out.println("Sum of odd digit is :"+OddSum);
    }
}