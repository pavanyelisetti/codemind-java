import java.util.*;
class ci
{
    public static int prime(int y)
    {
        int b=0;
        for(int i=2;i<=y/2;i++)
        {
            if(y%i==0)
            {
                b++;
            }
        }
        if(b==0)
        {
        return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m=0,n=0,h=0;
        int x=sc.nextInt();
        for(int i=x;i>=0;i--)
        {
            if(prime(i)==1)
            {
                m=i;
                break;
            }
        }
        int i=x;
        while(true)
        {
            if (prime(i)==1)
            {
                n=i;
                break;
            }
            i++;
        }
    
    if(Math.abs(x-m)>Math.abs(x-n))
    {
        h=n;
    }
    if(Math.abs(x-m)<=Math.abs(x-n))
    {
        h=m;
    }
    System.out.println(Math.abs(x-h));
}
}