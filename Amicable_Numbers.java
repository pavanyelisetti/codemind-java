import java.util.*;
class amicable
{
    public static int fac(int n)
    {
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c+=i;
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==fac(b) && b==fac(a))
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}