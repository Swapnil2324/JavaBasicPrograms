import java.util.Scanner;
class DecToBinary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        String binary="";

        if(num>0)
        {
            while(num>0)
            {
                int rem=num%2;
                binary=rem+binary;
                num/=2;
            }
            System.out.print(binary);
        }else{
            System.out.println("Wrong input");
        }
    }
}