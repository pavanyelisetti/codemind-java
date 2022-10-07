import java.util.*;
class palindrome{
    public static int palin(int x)
    {
        int temp,r,rev=0;
        temp=x;
        while(temp>0)
        {
            r=temp%10;
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
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(palin(a[i])==1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}