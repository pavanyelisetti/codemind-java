import java.util.*;
class rev
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
    public static int reve(int x)
    {
        int rev=0;
        int temp=x;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),c=0,c1=0,rev=0;
        if(prime(a)==1 )
        {
            if(prime(reve(a))==1)
            System.out.println("circular prime");
            else
            System.out.println("prime but not a circular prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}