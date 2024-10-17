import java.util.Scanner;
class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int dup=num;
        int cnt=0;
        while(num>0)
        {
            cnt++;
            num/=10;
        }
        int div=1;
        for(int i=1;i<=cnt;i++)
        {
            div*=10;
        }
        if(((dup*dup)%div)==dup)
            System.out.println(dup+" is a Automorphic Number.");
        else
            System.out.println(dup+" is not a Automorphic Number.");
    }
}