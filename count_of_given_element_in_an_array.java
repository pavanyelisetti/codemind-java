import java.util.Scanner;
class ind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x==a[i])
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}