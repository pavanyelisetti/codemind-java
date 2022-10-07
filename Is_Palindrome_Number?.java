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
            return 2;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            n=n*(-1);
        }
        System.out.println(palin(n));
    }
}