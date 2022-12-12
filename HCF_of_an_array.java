import java.util.Scanner;
class lcm
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
        int min=10000000;
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            min=a[i];
        }
        int c=0;
        for(int i=min;i>0;i--)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%i==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.println(i);
                break;
            }
        }
    }
}