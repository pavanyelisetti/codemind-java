import java.util.Scanner;
class hs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=(x*(x-1))/2;
        System.out.println(y);
    }
}