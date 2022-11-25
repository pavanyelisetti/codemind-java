import java.util.Scanner;
class spy
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int x=n;
        n=n*n;
        
        int temp=n;
        while(temp>0)
        {
            int r=temp%10;
            sum+=r;
            temp/=10;
        }
    
    if(x==sum)
    {
        System.out.println("Neon Number");
    }
    else
    {
        System.out.println("Not Neon Number");
    }
    }
}