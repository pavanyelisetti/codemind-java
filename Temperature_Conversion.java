import java.util.Scanner;
class temp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a;
        a=sc.nextFloat();
        float t;
        t=32+((a*9)/5);
        System.out.format("%.2f",t);
    }
}