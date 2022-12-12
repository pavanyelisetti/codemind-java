import java.util.Scanner;
class lcm
{
    public static int prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int c=0,c1=0;
        if(prime(a)==1)
        {
            int temp=a;
            while(temp>0)
            {
                int r=temp%10;
                c++;
                if(prime(r)==1)
                {
                    c1++;
                }
                temp/=10;
            }
            if(c==c1)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}