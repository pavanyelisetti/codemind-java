import java.util.*;
class fact
{
    public static int fact1(int x)
    {
        int mul=1;
        for(int i=1;i<=x;i++)
        {
            mul*=i;
        }
        return mul;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a,s=0;
        while(temp>0)
        {
            int r=temp%10;
            int h=fact1(r);
            s+=h;
            temp/=10;
        }
        if(s==a)
        {
            System.out.printf("The number %d is a strong number",a);
        }
        else
        {
            System.out.printf("The number %d is not a strong number",a);
        }
    }
}