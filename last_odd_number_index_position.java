import java.util.Scanner;
class ind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]%2==1)
            {
                System.out.println(i);
                break;
            }
        }
    }
}