import java.util.Scanner;
class sum{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        double x=0;
        for(int i=1;i<=n;i++)
        {
            x+=(1*1.0/i);
        }
        System.out.format("%.2f",x);
    }
}