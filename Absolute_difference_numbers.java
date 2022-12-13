import java.util.Scanner;
class num
{
    public static int rev1(int x)
    {
        int rev=0,temp=x;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        return rev;
    }
    public static int diff(int x,int n)
    {
        int temp=x,c=0,x1=0;
        while(temp>0)
        {
            int r=temp%10;
            c++;
            if(c>n)
            {
                break;
            }
            x1=x1*10+r;
            temp/=10;
        }
        return x1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int x=sc.nextInt();
        int temp=a,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        int m=diff(a,x);
        int n=diff(rev,x);
        int h=rev1(m);
        System.out.println(Math.abs(n-h));
    }
}