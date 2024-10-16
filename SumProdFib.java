import java.util.Scanner;
class SumProdFib
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int sum=0;
        int prod=1;

        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            prod*=rem;
            num/=10;
        }
        System.out.println("Sum of digits is :"+sum);
        System.out.println("Product of digits is :"+prod);
        Fibonacci(sum);
        Fibonacci(prod);
    }
    public static void Fibonacci(int num)
    {
        int prev1=0;
        int prev2=1;
        if(num==0)
            System.out.print(0+" is a Fibonacci Number.");
        else if(num==1)
            System.out.print(1+" is a Fibonacci Number.");
        else{
            for(int i=1;i<=num;i++)
            {
                int op=prev1+prev2;          
                prev1=prev2;                    
                prev2=op;               
            }
            if(prev1==num)
            {
                System.out.println(num+" is a Fibonacci Number.");
            }else if(prev1>num){
                System.out.println(num+" is not Fibonacci Number.");
            }
            
        
        }
    }
}