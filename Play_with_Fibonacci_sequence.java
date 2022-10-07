import java.util.Scanner;
class fibonacci{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        for(int i=1;i<=n-2;i++)
        {
            sum=a+b;
            System.out.print(sum);
            System.out.print(" ");
            a=b;
            b=sum;
        }
    }
}