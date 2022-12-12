import java.util.*;
class ci
{
    public static int self(int x)
    {
        int temp=x,c=0,c1=0;
        while(temp>0)
        {
            int r=temp%10;
            c++;
            if (r!=0)
            {
            if(x%r==0)
            {
                c1++;
            }
            }
            temp/=10;
        }
        if(c==c1)
        {
            return 1;            
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=x;i<=y;i++)
        {
            if(self(i)==1)
            {
                System.out.printf("%d ",i);
            }
        }
    }   
}