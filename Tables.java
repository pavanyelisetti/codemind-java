import java.util.Scanner;
class table
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j;
        for(j=1;j<=i;j++)
        {
            if(j%2==1)
            {
            System.out.printf("%d x %d = ",n,j);
            System.out.println(n*j);
            }
        }
        
    }
}