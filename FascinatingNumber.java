import java.util.Scanner;
class FascinatingNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3 or more digits number : ");
        int num=sc.nextInt();
        int num2=num*2;
        int num3=num*3;
        String op=""+num+num2+num3;
        System.out.println(op);
        System.out.println(op.length());
        boolean flag=true;
        for(int i='1';i<='9';i++)
        {
            int cnt=0;
            for(int j=0;j<op.length();j++)
            {
                if(op.charAt(j)==i)
                {
                    cnt++;
                }
            }
            System.out.println("count of "+i+" is :"+cnt );
            if(cnt!=1)
            {
                flag=false;
                break;
            }

        }
        if(flag==true)
        {
            System.out.println(num+" is a fascinating Number.");
        }else{
            System.out.println(num+" is not a fascinating Number.");
        }
    }
}