import java.util.*;
class prime
{
    public static int prime(int x)
    {
        int c=0;
        if(x==1)
        {
            return 0;
        }
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            c++;
        }
        if (c==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(prime(i)==1)
            {
                System.out.println(i);
            }
        }
    }
}