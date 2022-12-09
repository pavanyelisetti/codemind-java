import java.util.Scanner;
class adam
{
    public static int rev(int x)
    {
        int temp=x,rev=0;
        while(temp>0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n1=a*a;
        int n2=rev(a)*rev(a);
        if(n1==rev(n2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}