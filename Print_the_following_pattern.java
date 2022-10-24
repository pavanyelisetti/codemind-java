import java.util.Scanner;
class pattern
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j || i+j==n+1)
                {
                System.out.print(i); 
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}