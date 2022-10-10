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
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int [100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(prime(a[i])==1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}