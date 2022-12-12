import java.util.*;
class ci
{
    public static int pal(int x)
    {
        int temp=x,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if(x==rev)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=x;i<=y;i++)
        {
            if (pal(i)==1)
            {
                System.out.printf("%d ",i);
            }
        }
        }
}