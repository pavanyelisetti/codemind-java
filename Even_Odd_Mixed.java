import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a,c=0,c1=0;
        while(temp>0)
        {
            int r=temp%10;
            if (r%2==0)
            {
                c+=1;
            }
            else
            {
                c1+=1;
            }
            temp/=10;
        }
        if(c==0 && c1>0)
        {
            System.out.println("Odd");
        }
        else if(c1==0 && c>0)
        {
             System.out.println("Even");
        }
        else
        {
             System.out.println("Mixed");
        }
    }
}