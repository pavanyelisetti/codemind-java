import java.util.*;
class add
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        int temp1=rev,f=-1,rev1=0;
        while(temp1>0)
        {
            int r=temp1%10;
            if(r==6 && f==-1)
            {
                r=9;
                f=0;
            }
            rev1=rev1*10+r;
            temp1/=10;
        }
        System.out.println(rev1);
    }
}