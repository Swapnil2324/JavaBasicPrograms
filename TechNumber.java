import java.util.Scanner;
class TechNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int dup=num;
        int dup1=num;

        int cnt=0;
        while(num>0)
        {
            cnt++;
            num/=10;
        }
        if(cnt%2==0)
        {
            int div=1;
            for(int i=1;i<=cnt/2;i++)
            {
                div*=10;
            }
            int rem=dup%div;
            int rem1=dup/div;
            int op=rem1+rem;

            if((op*op)==dup1)
                System.out.println(dup1+" is a Tech Number.");
            else
                System.out.println(dup1+" is not a Tech Number.");
        }
        else{
            System.out.println(" Wrong Input.");
        }
    }
}