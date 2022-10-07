import java.util.*;
class prim{
    public static int prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c+=1;
            }
        }
        if(c==2)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int c=0;
            for(int j=1;j<=a;j++)
            {
                for(int k=1;k<=a;k++)
                {
                    if(j!=k)
                    {
                        if(j*k==a)
                        {
                            if((prime(j)==1) && prime(k)==1)
                            {
                                System.out.println("YES");
                                c=1;
                                break;
                            }
                        }
                    }
                    if(c==1)
                    {
                        break;
                    }
                }
            }
            if(c==0)
            {
                System.out.println("NO");
            }
        }
    }
}