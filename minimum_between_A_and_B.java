import java.util.Scanner;
class max
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int min=100000;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x && a[i]<=y)
            {
                if(a[i]<min)
                {
                    min=a[i];
                    c+=1;
                }
            }
        }
        if(c==0)
        System.out.println("-1");
        else
        System.out.println(min);
    }
}
