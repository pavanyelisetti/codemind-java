import java.util.Scanner;
class table
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0;
        System.out.printf("%d %d ",a,b);
        for(int i=1;i<=n-2;i++)
        {
            sum=a+b;
            System.out.printf("%d ",sum);
            a=b;
            b=sum;
        }
        
    }
}