import java.util.Scanner;
class spy
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,mul=1;
        int temp=n;
        while(temp>0)
        {
            int r=temp%10;
            sum+=r;
            mul*=r;
            temp/=10;
        }
    
    if(sum==mul)
    {
        System.out.println("Spy Number");
    }
    else
    {
        System.out.println("Not Spy Number");
    }
    }
}