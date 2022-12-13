import java.util.*;
class pair
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i<n-i-1)
            {
                System.out.printf("%d %d ",a[i],a[n-i-1]);
            }
        }
        
        if(n%2==1)
        {
            System.out.printf("%d",a[n/2]);
            System.out.println(" 0");
 }
}
}