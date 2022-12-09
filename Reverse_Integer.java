import java.util.*;
class rev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),f=0;
        if(a<0)
        {
            a=a*-1;
            f=1;
        }
        while(true)
        {
            if(a%10==0)
            {
                a/=10;
            }
            else
            {
                break;
            }
        }
        int temp=a,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if (f==0)
        System.out.println(rev);
        else
        System.out.printf("-%d",rev);
    }
}