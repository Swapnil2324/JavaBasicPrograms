import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        int prev1=0;
        int prev2=1;
        if(n==0)
            System.out.print(0+" ");
        else if(n==1)
            System.out.print(1+" ");
        else{
            for(int i=1;i<=n;i++)
            {
                System.out.print(prev1 +" ");
                int op=prev1+prev2;          
                prev1=prev2;                    
                prev2=op;                    
            }
            
        
        }

    }
}