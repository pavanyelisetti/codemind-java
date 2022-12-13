import java.util.Scanner;
class lcm
{
    public static int rev(int x)
    {
        int temp=x,rev1=0;
        while(temp>0)
        {
            int r=temp%10;
            rev1=rev1*10+r;
            temp/=10;
        }
        return rev1;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        n=n+rev(n);
        int temp=n;
        while(true)
        {
            if(temp==rev(temp))
            {
                System.out.println(temp);
                break;
            }
            else
            {
                temp=temp+rev(temp);
            }
        }
        
    }
}