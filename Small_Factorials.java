import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int x=sc.nextInt();
            int mul=1;
            for(int j=1;j<=x;j++)
            {
                mul*=j;
            }
            System.out.println(mul);
        }
    }
}