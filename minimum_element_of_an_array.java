import java.util.Scanner;
class ind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0,x=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int mini=100000;
        int avg=(c/n);
        for(int i=0;i<n;i++)
        {
            if(a[i]<mini)
            {
                mini=a[i];
            }
        }
        System.out.println(mini);
    }
}