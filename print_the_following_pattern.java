import java.util.Scanner;
class pattern
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-2;j++)
            {
                 System.out.print(j);   
            }
            for(int k=n-3;k>=1;k--)
            {
                 System.out.print(k);
            }
            System.out.println();
        }
    }
}