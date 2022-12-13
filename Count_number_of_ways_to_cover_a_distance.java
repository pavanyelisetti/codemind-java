import java.util.Scanner;
class count
{
    public static int dis(int x)
    {
        if(x==1)
        {
            return 1;
        }
        else if(x==2)
        {
            return 2;
        }
        else if(x==3)
        {
            return 4;
        }
        return (dis(x-1)+dis(x-2)+dis(x-3));
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(dis(n));
    }
}