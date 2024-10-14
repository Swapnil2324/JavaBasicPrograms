//Count of Prime Digits in a Number:

import java.util.Scanner;
class CntOfprimeInNo
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
            int rem=num%10;
            boolean flag=true;
            if(rem>1)
            {
                for(int i=2;i<rem;i++)
                {
                    if (rem%i==0)
                    {
                        flag=false;
                        break;
                    }
                }
            }else{
                flag=false;
            }

            if(flag)
            {
                cnt+=1;
            }
            
            num/=10;
        }
        System.out.print("Count of Prime digits in "+dup+" is "+cnt);
    }
}