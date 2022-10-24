import java.util.Scanner;
class pal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        for(int x=1;x<=b;x++)
        {
        int n=sc.nextInt();
        int temp=n,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if(rev==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        }
    }
}