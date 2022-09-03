import java.util.Scanner;
class disc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,x;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=a*b*c*2*512;
        System.out.println(x);
    }
}