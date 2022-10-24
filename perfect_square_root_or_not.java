import java.util.Scanner;
class pal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=1;i<=n;i++)
        {
            if(n==i*i)
            {
                System.out.println("True");
                x=1;
                break;
            }
        }
        if(x==0)
        {
            System.out.println("False");
        }
    }
}