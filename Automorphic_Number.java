import java.util.*;
class rev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),c=0,c1=0,rev=0;
        int n=a*a;
        int temp=a;
        while(temp>0)
        {
            int r=temp%10;
            c++;
            temp/=10;
        }
        temp=n;
        
        while(temp>0)
        {
            int r=temp%10;
            c1++;
            rev=rev*10+r;
            if(c==c1)
            {
            break;
            }
            temp/=10;
        }
        int rev2=0;
        while(rev>0)
        {
            int r=rev%10;
            rev2=rev2*10+r;
            rev/=10;
        }
        if(a==rev2)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}