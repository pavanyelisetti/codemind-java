import java.util.Scanner;
class table
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0,x=0;
        for(int i=1;i<=n;i++)
        {
            sum=a+b;
            if(sum==n)
            {
                System.out.println("True");
                x=1;
                break;
            }
            a=b;
            b=sum;
        }
        if(x==0)
        {
            System.out.println("False");
        }
    }
}