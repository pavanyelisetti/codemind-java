import java.util.*;
class ci
{
    public static int rev(int y)
    {
        int temp=y,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if(y==rev)
        {
        return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(),m=0;
        for(int i=x-1;i>=0;i--)
        {
            if(rev(i)==1)
            {
                m=i;
                break;
            }
        }
        int i=x+1,n=0;
        while(true)
        {
            if (rev(i)==1)
            {
                n=i;
                break;
            }
            i++;
        }
    
    if(Math.abs(x-m)>Math.abs(x-n))
    {
        System.out.println(n);
    }
    if(Math.abs(x-m)==Math.abs(x-n))
    {
        System.out.printf("%d %d",m,n);
    }
    else
    {
        System.out.println(m);
    }
    }
}
