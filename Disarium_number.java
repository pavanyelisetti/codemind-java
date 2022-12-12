import java.util.Scanner;
class ugly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int  temp=a,c=0,sum=0,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        temp=rev;
        while(temp>0)
        {
            int r=temp%10;
            c++;
            sum+=(Math.pow(r,c));
            temp/=10;
        }
        if(sum==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}