import java.util.Scanner;
class sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int a[]= new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]<x || a[i]>y)
            {
                System.out.printf("%d ",a[i]);
                sum+=1;
            }
        }
        if(sum==0)
        {
            System.out.println("-1");    
        
        }
    }
}