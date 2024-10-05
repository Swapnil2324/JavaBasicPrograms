import java.util.Scanner;
// swapping two number using 3 variables
class SwapTwoNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter a Number2 : ");
        int num2=sc.nextInt();
        System.out.println("---------Before Swapping---------");
        System.out.println("Number1 : "+num1);
        System.out.println("Number2 : "+num2);
        int temp=0;

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("---------After Swapping---------");
        System.out.println("Number1 : "+num1);
        System.out.println("Number2 : "+num2);




    }
}