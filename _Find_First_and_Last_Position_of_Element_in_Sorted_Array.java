import java.util.*;
class pro
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt(),f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.printf("%d ",i);
                f=1;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==x)
            {
                System.out.printf("%d ",i);
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("-1 -1");
        }

    }
}