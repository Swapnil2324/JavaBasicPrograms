import java.util.Scanner;
class CheckFibonacciNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        int prev1=0;
        int prev2=1;
        if(n==0)
            System.out.print(0+" is a Fibonacci Number.");
        else if(n==1)
            System.out.print(1+" is a Fibonacci Number.");
        else{
            for(int i=1;i<=n;i++)
            {
                int op=prev1+prev2;          
                prev1=prev2;                    
                prev2=op;               
            }
            if(prev1==n)
            {
                System.out.println(n+" is a Fibonacci Number.");
            }else if(prev1>n){
                System.out.println(n+" is not Fibonacci Number.");
            }
            
        
        }

    }
}