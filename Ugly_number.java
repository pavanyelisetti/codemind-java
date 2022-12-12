import java.util.Scanner;
class ugly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int f=0;
        while(true)
        {
            if(a%5==0)
            {
                a/=5;
            }
            else if(a%3==0)
            {
                a/=3;
            }
            else if(a%2==0)
            {
                a/=2;
            }
            else
            {
            if(a==1)
            {
                break;
            }
            else
            {
                System.out.print("Not Ugly Number");
                f=1;
                break;
            }
            }
        }
        if(f==0)
            System.out.print("Ugly Number");
    }
}