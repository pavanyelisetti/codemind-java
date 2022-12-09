import java.util.*;
class pro
{
    public static int prime(int x)
    {
        if(x==1)
        {
            return 0;
        }
        int c=0;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),f=0;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(i!=j)
                {
                    if(i*j==a)
                    {
                       
                        if(prime(i)==1 && prime(j)==1)
                        {
                            System.out.printf("%d %d",i,j);
                            f=1;
                            break;
                        }
                    }
                }
                if(f==1)
                break;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
}