import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0,sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                if(a[i]==a[j])
                {
                    a[j]=-1;
                }
                }
            }
     
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
    
}