import java.util.Scanner;
class lcm
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum,p=0,q=0;
        for(int i=0;i<n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
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
        if((Math.abs(p-n))<(Math.abs(q-n)))
        {
            System.out.println(p);
        }
        else if((Math.abs(p-n))==(Math.abs(q-n)))
        {
            System.out.printf("%d %d",p,q);
        }
        else
        {
            System.out.println(q);
        }
    }
}