import java.util.*;
class add
{
    public static void digits(int x)
    {
        int s=0;
        int temp=x;
        while(temp>0)
        {
            int r=temp%10;
            
            s+=r;
            temp/=10;
        }
        if(s<=9)
        {
            System.out.println(s);
        }
        else
        digits(s);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        digits(a);
    }
}