import java.util.Scanner;
class lcm
{
    public static int pow(int x)
    {
        int mul=1;
        for(int i=1;i<=x;i++)
        {
            mul*=2;
        }
        return mul;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,p=0,q=0;
        for(int i=1;i<=n;i++)
        {
            int sum=pow(i);
            if(sum<=n)
            {
                p=sum;
            }
            else
            {
             q=sum;
            break;
            }
        }
        if((Math.abs(p-n))<=(Math.abs(q-n)))
        {
            System.out.println(Math.abs(p-n));
        }
        else
        {
            System.out.println(Math.abs(q-n));
        }
    }
}