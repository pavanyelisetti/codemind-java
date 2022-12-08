import java.util.*;
class add
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a,s=0,m=1;
        while(temp>0)
        {
            int r=temp%10;
            s+=r;
            m*=r;
            temp/=10;
        }
        System.out.println(Math.abs(s-m));
    }
}