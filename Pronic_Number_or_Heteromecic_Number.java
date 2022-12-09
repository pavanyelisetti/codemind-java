import java.util.*;
class rev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),f=0;
        for(int i=1;i<=a;i++)
        {
            if(i*(i+1)==a)
            {
                System.out.println("YES");
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("NO");
        }
    }
}