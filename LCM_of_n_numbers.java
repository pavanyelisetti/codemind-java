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
        int mul=1;
        for(int i=0;i<n;i++)
        {
            mul*=a[i];
        }
        int c=0;
        for(int i=1;i<=100000000;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(i%a[j]==0)
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