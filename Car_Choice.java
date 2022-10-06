import java.util.Scanner;
class car{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            if((float)c/a<(float)d/b)
            {
                System.out.println("-1");
            }
            else if((float)c/a==(float)d/b)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}