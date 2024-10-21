import java.util.Scanner;
class EvilNumber
{
    public static String decimalToBinary(int num)
    {
        String binary="";
        if(num>0)
        {
            while(num>0)
            {
                int rem=num%2;
                binary=rem+binary;
                num/=2;
            }
            return binary;
        }
        return "";
    }
    public static int countOfOne(String str)
    {
        int cnt=0;
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='1')
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        String binStr=decimalToBinary(num);
        int cnt=countOfOne(binStr);

        if(cnt%2==0)
        {
            System.out.println(num+" is a Evil Number.");
        }else{
            System.out.println(num+" is not a Evil Number.");
        }
    }
}