import java.util.Scanner;
class pal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rev=0;
        int max=0;
        while(temp>0)
        {
            int r=temp%10;
            if(max<=r)
            {
                max=r;
            }
            temp/=10;
        }
        System.out.println(max);
    }
}